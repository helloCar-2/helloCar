package com.example.helloCar.domain.member.entity;

import com.example.helloCar.global.jpa.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public class Member extends BaseEntity {

    private String name;
    @Column(unique = true)
    private String username;

    private String password;

    private String email;
}
