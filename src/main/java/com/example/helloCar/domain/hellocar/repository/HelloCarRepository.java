package com.example.helloCar.domain.hellocar.repository;

import com.example.helloCar.domain.hellocar.entity.HelloCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HelloCarRepository extends JpaRepository<HelloCar, Long> {

    List<HelloCar> findByBrand(String brand);

    @Query("SELECT hc FROM HelloCar hc " +
            "WHERE hc.brand LIKE %:brand " +
            "AND hc.carname LIKE %:carName " +
            "AND hc.fuel LIKE %:fuel " +
            "AND hc.minPrice <= :maxPrice " +
            "AND hc.maxPrice >= :minPrice")
    List<HelloCar> findCarsByCriteria(
            @Param("brand") String brand,
            @Param("carName") String carName,
            @Param("fuel") String fuel,
            @Param("minPrice") int minPrice,
            @Param("maxPrice") int maxPrice);


}
