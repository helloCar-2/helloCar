package com.example.helloCar.domain.wishList.service;

import com.example.helloCar.domain.hellocar.repository.HelloCarRepository;
import com.example.helloCar.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WishListService {
    private final HelloCarRepository helloCarRepository;
    private final MemberRepository memberRepository;

//    public boolean toggleHeart(Long carId, Member member) {
//        Optional<HelloCar> ho = helloCarRepository.findById(carId);
//        HelloCar helloCar = ho.get();
//        boolean isLiked = helloCar.getMembers().contains(member);
//
//        if (isLiked) {
//            helloCar.getMembers().remove(member);
//        } else {
//            helloCar.getMembers().add(member);
//        }
//        this.helloCarRepository.save(helloCar);
//        return !isLiked;
//    }
}
