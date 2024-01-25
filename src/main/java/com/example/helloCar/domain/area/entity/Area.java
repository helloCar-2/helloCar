package com.example.helloCar.domain.area.entity;


import com.example.helloCar.domain.global.baseentity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Area extends BaseEntity {

    private String drivingLoungeName;

    private String drivingLoungeURL;
}
