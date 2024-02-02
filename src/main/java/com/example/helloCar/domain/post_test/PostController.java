package com.example.helloCar.domain.post_test;

import com.example.helloCar.domain.global.rs.RsData;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/posts")
public class PostController {

    private final PostService postService;

    @AllArgsConstructor
    @Getter
    public static class PostsResponse {
        private final List<Post> posts;
    }

    @GetMapping("")
    public RsData<PostsResponse> posts(){
        List<Post> posts = new ArrayList<>() {{
            add(new Post(1L,"제목1","내용1", LocalDateTime.now()));
            add(new Post(2L,"제목2","내용2", LocalDateTime.now()));
            add(new Post(3L,"제목3","내용3", LocalDateTime.now()));
        }};


        return RsData.of(
                "s-1",
                "성공",
                new PostsResponse(posts));

    }

    @AllArgsConstructor
    @Getter
    public static class PostResponse {
        private final Post post;
    }
    @GetMapping("/{id}")
    public RsData<PostResponse> post(@PathVariable("id") Long id){
        List<Post> posts = new ArrayList<>() {{
            add(new Post(1L,"제목1","내용1", LocalDateTime.now()));
            add(new Post(2L,"제목2","내용2", LocalDateTime.now()));
            add(new Post(3L,"제목3","내용3", LocalDateTime.now()));
        }};

        Post post = Post.builder()
                .id(id)
                .subject("제목1"+id)
                .content("내용1")
                .createDate(LocalDateTime.now())
                .build();


        return RsData.of(
                "s-1",
                "성공",
                new PostResponse(post));

    }
}
