package com.example.helloCar.domain.member.entity;

import com.example.helloCar.domain.global.baseentity.BaseEntity;
import com.example.helloCar.domain.hellocar.entity.HelloCar;
import com.example.helloCar.domain.testdrive.entity.TestDrive;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "id")
public class Member extends BaseEntity {

    private String name;
    @Column(unique = true)
    private String username; //김땡땡1ddfvcsf

    private String password;
    @Column(unique = true)
    private String email; //김땡땡@gmail.comfssfvcxdf

    @ManyToMany
    Set<HelloCar> helloCars;

    @OneToMany(mappedBy = "member", cascade = CascadeType.REMOVE)
    private List<TestDrive> testDrive;

//
//    @ManyToMany(cascade = CascadeType.REMOVE)
//    @JoinTable(
//    name="hello_car_members",
//            joinColumns = @JoinColumn(name="member_id")
//
//
//    )

    @Setter
    private boolean isOutAccount = false;

    // 현재 회원이 가지고 있는 권한들을 List<GrantedAuthority> 형태로 리턴
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("MEMBER"));

        if (isAdmin()) {
            authorities.add(new SimpleGrantedAuthority("admin"));
        }

        return authorities;
    }

    public boolean isAdmin() {
        return "admin".equals(username);
    }

    public Map<String, Object> toClaims() {
        return Map.of(
                "id", getId(),
                "username", getUsername()
        );
    }
}
