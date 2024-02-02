package com.example.helloCar.domain.wishList.service;

import com.example.helloCar.domain.hellocar.entity.HelloCar;
import com.example.helloCar.domain.hellocar.repository.HelloCarRepository;
import com.example.helloCar.domain.member.entity.Member;
import com.example.helloCar.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class WishListService {
    private final HelloCarRepository helloCarRepository;
    private final MemberRepository memberRepository;

    public boolean toggleHeart(Long carId, Member member) {
        Optional<HelloCar> ho = helloCarRepository.findById(carId);
        HelloCar helloCar = ho.get();
        boolean isLiked = helloCar.getMembers().contains(member);

        if (isLiked) {
            helloCar.getMembers().remove(member);
            member.getHelloCars().remove(helloCar);
        } else {
            helloCar.getMembers().add(member);
            member.getHelloCars().add(helloCar);
        }
        this.helloCarRepository.save(helloCar);
        this.memberRepository.save(member);
        return !isLiked;
    }
}
