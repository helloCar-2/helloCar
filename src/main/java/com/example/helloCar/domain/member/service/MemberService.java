package com.example.helloCar.domain.member.service;

import com.example.helloCar.domain.global.jwt.JwtProvider;
import com.example.helloCar.domain.member.entity.Member;
import com.example.helloCar.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    private final JwtProvider jwtProvider;
    private final PasswordEncoder passwordEncoder;

    public Member join(String username, String password, String email) {
        Member member = Member.builder()
                .username(username)
                .password(password)
                .email(email)
                .build();

        memberRepository.save(member);

        return member;
    }

    public Optional<Member> findByUsername(String username) {
        return memberRepository.findByUsername(username);
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
}
