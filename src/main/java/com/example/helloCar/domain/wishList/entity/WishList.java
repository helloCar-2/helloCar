package com.example.helloCar.domain.wishList.entity;

import com.example.helloCar.domain.global.baseentity.BaseEntity;
import com.example.helloCar.domain.hellocar.entity.HelloCar;
import com.example.helloCar.domain.member.entity.Member;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
public class WishList extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "carId")
    private HelloCar helloCar;

    @ManyToOne
    @JoinColumn(name = "memberId")
    private Member member;
}
