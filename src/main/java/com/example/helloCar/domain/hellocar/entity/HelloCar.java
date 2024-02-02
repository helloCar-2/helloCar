package com.example.helloCar.domain.hellocar.entity;

import com.example.helloCar.domain.global.baseentity.BaseEntity;
import com.example.helloCar.domain.member.entity.Member;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Comment;

import java.util.Set;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class HelloCar extends BaseEntity {

    @Comment("차량 이름")
    private String carname;

    @Comment("차량 이미지")
    private String img;

    @Comment("브랜드")
    private String brand;

    @Comment("최소가격")
    private int minPrice;

    @Comment("최대가격")
    private int maxPrice;

    @Comment("차 연식")
    private int modelYear;

    @Comment("차종")
    private String vehicle;

    @Comment("차 크기")
    private String size;

    @Comment("차 연료")
    private String fuel;

    @ManyToMany
    private Set<Member> members;

    //위시리스트
//    public boolean checkedHeartClickMember(String username) {
//        for (Member m : members) {
//            if (username.equals(m.getUsername())) {
//                return true;
//            }
//        }
//        return false;
//    }
}


