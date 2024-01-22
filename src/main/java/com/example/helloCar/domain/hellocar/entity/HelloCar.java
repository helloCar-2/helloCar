package com.example.helloCar.domain.hellocar.entity;

import com.example.helloCar.domain.global.baseentity.BaseEntity;
import com.example.helloCar.domain.member.entity.Member;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Set;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class HelloCar extends BaseEntity {

    @Column(unique = true)
    private String carname;

    private String brand;

    private int minPrice;

    private int maxPrice;

    private int modelYear;

    private String vehicle;

    private String size;

    private String fuel;

    @ManyToMany
    Set<Member> members;
}
