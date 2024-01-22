package com.example.helloCar.domain.question.entity;

import com.example.helloCar.domain.global.baseentity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Question extends BaseEntity {

    private String title;

    private String content;
}
