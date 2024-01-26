package com.example.helloCar.domain.testdrive.entity;

import com.example.helloCar.domain.area.entity.Area;
import com.example.helloCar.domain.global.baseentity.BaseEntity;
import com.example.helloCar.domain.hellocar.entity.HelloCar;
import com.example.helloCar.domain.member.entity.Member;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class TestDrive extends BaseEntity {

    @ManyToOne
    private Member member;
    // 유저 id (유저정보)

    @ManyToOne
    private HelloCar car;
    // 차량 id (차량정보)

    @ManyToOne
    private Area area;
    // 시승센터 id (ex 드라이빙라운지 대전점 id)

    private LocalDate date;
    // 시승 날짜

    private String time;
    // 시승 시간대

    private String userCar;
    // 보유 차량 및 연식

    private String request;
    //기타 요청 사항
}
