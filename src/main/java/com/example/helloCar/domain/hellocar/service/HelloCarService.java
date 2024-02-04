package com.example.helloCar.domain.hellocar.service;

import com.example.helloCar.domain.hellocar.entity.HelloCar;
import com.example.helloCar.domain.hellocar.repository.HelloCarRepository;
import com.example.helloCar.domain.member.entity.Member;
import com.example.helloCar.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HelloCarService {

    private final HelloCarRepository helloCarRepository;
    private final MemberRepository memberRepository;

    public HelloCar create(String carname, String img, String brand, int maxPrice,
                           int minPrice, int modelYear, String vehicle, String size, String fuel) {

        HelloCar helloCar = HelloCar
                .builder()

                .carname(carname)
                .img(img)

                .brand(brand)
                .maxPrice(maxPrice)
                .minPrice(minPrice)
                .modelYear(modelYear)
                .vehicle(vehicle)
                .size(size)
                .fuel(fuel)
                .build();
        this.helloCarRepository.save(helloCar);
        return helloCar;
    }

//    private String saveProfileImage(MultipartFile profileImage) {
//        if (profileImage == null || profileImage.isEmpty()) {
//            // 프로필 이미지가 없을 경우 null 반환
//            return null;
//        }
//        return null;
//    }

    public void delete(HelloCar helloCar) {
        helloCarRepository.delete(helloCar);
    }

    public void save(HelloCar car) {
        this.helloCarRepository.save(car);
    }

    public List<HelloCar> findAll() {
        return this.helloCarRepository.findAll();
    }

    public HelloCar findById(Long id) {
        return this.helloCarRepository.findById(id).get();
    }

    public List<HelloCar> findByBrand(String brand) {
        return this.helloCarRepository.findByBrand(brand);
    }

    public List<HelloCar> keywordSearch(String brand, String carname, String fuel, int minPrice, int maxPrice) {
        return this.helloCarRepository.findCarsByCriteria(brand, carname, fuel, minPrice, maxPrice);

    }
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
