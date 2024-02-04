package com.example.helloCar.domain.wishList.repository;

import com.example.helloCar.domain.wishList.entity.WishList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishListRepository extends JpaRepository<WishList, Long> {

}