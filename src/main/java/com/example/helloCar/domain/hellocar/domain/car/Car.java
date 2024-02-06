package com.example.helloCar.domain.hellocar.domain.car;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;
    //브랜드

    private String carName;
    //차 이름

    private int minPrice;
    //최소 가격

    private int maxPrice;
    //최대 가격

    private String vehicle;
    //차종

    private String fuel;
    //유종

    private int modelYear;
    //연식

    private String size;
    //차량 사이즈

}