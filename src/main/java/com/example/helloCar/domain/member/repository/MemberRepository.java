package com.example.helloCar.domain.member.repository;

import com.example.helloCar.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByUsername(String username);
    Optional<Member> findByEmail(String email);

    Optional<Member> findByNameAndEmail(String name, String email);

    Optional<Member> findByNameAndEmailAndUsername(String name, String email, String username);
}
