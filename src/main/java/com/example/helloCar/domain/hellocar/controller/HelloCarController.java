package com.example.helloCar.domain.hellocar.controller;

import com.example.helloCar.domain.global.jwt.JwtProvider;
import com.example.helloCar.domain.global.rs.RsData;
import com.example.helloCar.domain.global.tokenverify.TokenController;
import com.example.helloCar.domain.hellocar.entity.HelloCar;
import com.example.helloCar.domain.hellocar.service.HelloCarService;
import com.example.helloCar.domain.member.entity.Member;
import com.example.helloCar.domain.member.service.MemberService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/hellocar", produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
public class HelloCarController {

    private final HelloCarService helloCarService;
    private final MemberService memberService;
    private final TokenController tokenController;
    private final JwtProvider jwtProvider;

    @Data
    public static class HelloCarRequest {
        @NotBlank
        private String carName;
        private String img;
        @NotBlank
        private String brand;
        @NotNull
        private int maxPrice;
        @NotNull
        private int minPrice;
        @NotNull
        private int modelYear;
        @NotBlank
        private String vehicle;
        @NotBlank
        private String size;
        @NotBlank
        private String fuel;
    }

    //등록
    @AllArgsConstructor
    @Getter
    public static class HellocarResponse {
        private final HelloCar helloCar;
    }

    @PostMapping(value = "/create", consumes = APPLICATION_JSON_VALUE)
    public RsData<HellocarResponse> create(@RequestBody HelloCarRequest helloCarRequest) {
        HelloCar helloCar = helloCarService.create(helloCarRequest.getCarName(), helloCarRequest.getImg(), helloCarRequest.getBrand(),
                helloCarRequest.getMaxPrice(), helloCarRequest.getMinPrice(), helloCarRequest.getModelYear(), helloCarRequest.getVehicle(),
                helloCarRequest.getSize(), helloCarRequest.getFuel());

        return RsData.of("S-5", "성공", new HellocarResponse(helloCar));
    }


    @AllArgsConstructor
    @Getter
    public static class HelloCarsResponse {
        private final List<HelloCar> helloCars;
    }

    @Data
    public static class HelloCarsRequest {
        private String brand;
    }

    @PostMapping(value = "/lists", consumes = APPLICATION_JSON_VALUE)
    public RsData<HelloCarsResponse> lists(@RequestBody HelloCarsRequest helloCarsRequest) {
        List<HelloCar> carList = this.helloCarService.findByBrand(helloCarsRequest.getBrand());
        return RsData.of("S-6", "성공", new HelloCarsResponse(carList));
    }

    @AllArgsConstructor
    @Getter
    public static class HelloCarSerchListResponse {
        private final List<HelloCar> helloCars;
    }


    @GetMapping("/lists")
    public RsData<HelloCarSerchListResponse> searchList(@RequestParam(value = "brand", defaultValue = "") String brand,
                                                        @RequestParam(value = "carname", defaultValue = "") String carname,
                                                        @RequestParam(value = "fuel", defaultValue = "") String fuel,
                                                        @RequestParam(value = "minPrice", defaultValue = "0") int minPrice,
                                                        @RequestParam(value = "maxPrice", defaultValue = "100000") int maxPrice) {

        List<HelloCar> carList = this.helloCarService.keywordSearch(brand, carname, fuel, minPrice, maxPrice);
        return RsData.of("S-7", "성공", new HelloCarSerchListResponse(carList));
    }

    @AllArgsConstructor
    @Getter
    public static class selectResponses {
        private final boolean ischecked;
    }

    @PostMapping(value = "/{id}")
    public RsData<selectResponses> toggleFavorite(@PathVariable("id") Long carId, HttpServletRequest request) {
        String token = tokenController.extractTokenFromHeader(request);
        String username = jwtProvider.getUsername(token);
        Member member = this.memberService.findByUsername(username).get();
        boolean isLiked = this.helloCarService.toggleHeart(carId, member);


        if (member == null) {
            // 사용자가 인증되지 않은 경우 처리
            return RsData.of("E-1", "사용자가 인증되지 않았습니다.", null);
        }
        return RsData.of(
                "S-2",
                "성공",
                new selectResponses(isLiked)
        );
    }

    @AllArgsConstructor
    @Getter
    public static class detailResponse {
        private final boolean ischecked;
        private final HelloCar result;
    }

    @GetMapping("/{id}")
    public RsData<detailResponse> detail(@PathVariable(value = "id") Long id, HttpServletRequest request) {
        String token = tokenController.extractTokenFromHeader(request);
        String username = jwtProvider.getUsername(token);
        Member member = this.memberService.findByUsername(username).orElse(null);

        HelloCar result = this.helloCarService.findById(id);
        boolean ischecked = result.getMembers().contains(member);

        return RsData.of("S-8", "성공", new detailResponse(ischecked, result));
    }

    @AllArgsConstructor
    @Getter
    public static class WishListResponse {
        private final List<HelloCar> helloCarList;
//        private final boolean ischecked;
    }

    @PostMapping(value = "/wishLists", consumes = APPLICATION_JSON_VALUE)
    public RsData<WishListResponse> wishList(HttpServletRequest request) {

        String token = tokenController.extractTokenFromHeader(request);
        String username = jwtProvider.getUsername(token);

        Member member = this.memberService.findByUsername(username).orElse(null);

        List<HelloCar> wishList = new ArrayList<>();
        for (HelloCar car : member.getHelloCars()) {
            wishList.add(car);
        }

        return RsData.of("S-9", "성공", new WishListResponse(wishList));
    }

    @DeleteMapping(value = "/delete/{carId}", consumes = MediaType.ALL_VALUE)
    public RsData<WishListResponse> delete(@PathVariable("carId") Long carId, HttpServletRequest request) {
        String token = tokenController.extractTokenFromHeader(request);
        String username = jwtProvider.getUsername(token);
        Member member = this.memberService.findByUsername(username).orElse(null);
        this.helloCarService.toggleHeart(carId, member);

        HelloCar result = this.helloCarService.findById(carId);

        if (result != null) {
            List<HelloCar> wishList = new ArrayList<>(member.getHelloCars());
            return RsData.of("S-11", "찜 삭제 성공", new WishListResponse(wishList));
        } else {
            return RsData.of("E-11", "해당 차량을 찾을 수 없습니다.", null);
        }
    }
}

