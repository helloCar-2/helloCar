package com.example.helloCar.domain.member.service;

import com.example.helloCar.domain.global.jwt.JwtProvider;
import com.example.helloCar.domain.hellocar.repository.HelloCarRepository;
import com.example.helloCar.domain.member.entity.Member;
import com.example.helloCar.domain.member.repository.MemberRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final HelloCarRepository helloCarRepository;
    private final MemberRepository memberRepository;
    private final JwtProvider jwtProvider;
    private final PasswordEncoder passwordEncoder;

    public void deleteMember(Long memberId) {
        Optional<Member> om = memberRepository.findById(memberId);
        if (om.isPresent()) {
            Member member = om.get();

            memberRepository.delete(member);
        }
    }

    public Member join(String email, String name, String password, String username) {
        Member member = Member.builder()
                .username(username)
                .name(name)
                .password(passwordEncoder.encode(password))
                .email(email)
                .build();

        memberRepository.save(member);
        return member;
    }

    public Member modify(String username, String newName, String newPassword) {
        Member member = memberRepository.findByUsername(username) //유저 찾기
                .orElseThrow(() -> new IllegalArgumentException("User not found with username: " + username));

        Member modifiedMember = Member.builder()
                .name(newName)
                .password(passwordEncoder.encode(newPassword))
                .build();

        member.setName(modifiedMember.getName());
        member.setPassword(modifiedMember.getPassword());

        memberRepository.save(member);
        return member;
    }

    public Optional<Member> findByUsername(String username) {
        return memberRepository.findByUsername(username);
    }

    public Member findById(Long id) {
        return this.memberRepository.findById(id).get();
    }

    public String genAccessToken(String username, String password) {
        Member member = findByUsername(username).orElse(null);

        if (member == null) return null;

        if (!passwordEncoder.matches(password, member.getPassword())) {
            return null;
        }

        return jwtProvider.genToken(member.toClaims(), 60 * 5);
    }

    public String genRefreshToken(String username, String password) {
        Member member = findByUsername(username).orElse(null);

        if (member == null) return null;

        if (!passwordEncoder.matches(password, member.getPassword())) {
            return null;
        }

        return jwtProvider.genToken(member.toClaims(), 60 * 60 * 24 * 365);
    }

    public String genNewAccessToken(String username) {
        Member member = findByUsername(username).orElse(null);

        if (member == null) return null;

        return jwtProvider.genToken(member.toClaims(), 60 * 5);
    }

    public Member findByNameAndEmail(String name, String email) {
        Optional<Member> result = this.memberRepository.findByNameAndEmail(name, email);

        return result.orElse(null);
    }

    public Member findByNameAndEmailAndUsername(String name, String email, String username) {
        Optional<Member> result = this.memberRepository.findByNameAndEmailAndUsername(name, email, username);
        return result.orElse(null);
    }

    public void PWmodify(Member username, String pw) {
        Member PWmodifyMember = Member.builder()
                .id(username.getId())
                .name(username.getName())
                .username(username.getUsername())
                .password(passwordEncoder.encode(pw))
                .email(username.getEmail())
                .helloCars(username.getHelloCars())
                .build();

        this.memberRepository.save(PWmodifyMember);
    }

    //소셜 로그인
//    @Transactional
//    public Member whenSocialLogin(String providerTypeCode, String name, String username) {
//        Optional<Member> os = this.memberRepository.findByUsername(username);
//        if (os.isPresent()) return os.get();
//        String email, String name, String password, String username
//        MultipartFile profileImage, String username, String name, String password,
//                String email, String area, String level, LocalDate birthdate,Team team, int rating);
//        return join(); // 최초 로그인 시 딱 한번 실행
//
//    }

    //소셜 로그인
    @Transactional
    public Member whenSocialLogin(String providerTypeCode, String name, String username) {
        Optional<Member> os = this.memberRepository.findByUsername(username);
        if (os.isPresent()) return os.get();

        return join(null, name, "", null); // 최초 로그인 시 딱 한번 실행
    }
}
