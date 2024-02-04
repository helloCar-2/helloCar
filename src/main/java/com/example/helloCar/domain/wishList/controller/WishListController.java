package com.example.helloCar.domain.wishList.controller;

import com.example.helloCar.domain.global.jwt.JwtProvider;
import com.example.helloCar.domain.global.tokenverify.TokenController;
import com.example.helloCar.domain.member.service.MemberService;
import com.example.helloCar.domain.wishList.service.WishListService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/wishList", produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
public class WishListController {
    private final JwtProvider jwtProvider;
    private final TokenController tokenController;
    private final MemberService memberService;
    private final WishListService wishListService;

    @AllArgsConstructor
    @Getter
    public static class FavoriteResponse {
        private final Boolean isLiked;
    }
//
//    @PostMapping("/{id}")
//    public RsData<FavoriteResponse> toggleFavorite(@PathVariable("id") Long carId, HttpServletRequest request) {
//        String token = tokenController.extractTokenFromHeader(request);
//        String username = jwtProvider.getUsername(token);
//        Member member = this.memberService.findByUsername(username).get();
//        boolean isLiked = this.wishListService.toggleHeart(carId, member);
//
//        if (member == null) {
//            // 사용자가 인증되지 않은 경우 처리
//            return RsData.of("E-1", "사용자가 인증되지 않았습니다.", null);
//        }
//        return RsData.of(
//                "S-2",
//                "성공",
//                new FavoriteResponse(isLiked)
//        );
//    }

//    //찜 해제
//    @AllArgsConstructor
//    @Getter
//    public static class DeleteResponse {
//        private final String carId;
//    }
//    @DeleteMapping(value = "/delete/{id}", consumes = ALL_VALUE)
//    public RsData<DeleteResponse> delete(@RequestParam(value = "carId") Long carId, HttpServletRequest request) {
////        String token = tokenController.extractTokenFromHeader(request);
////        String username = jwtProvider.getUsername(token);
////        Member member = this.memberService.findByUsername(username).get();
//
//        wishListService.deleteWishList(carId);
//        return RsData.of("S-3", "찜 취소 성공", null);
//    }

}
