package com.dailycoding.blogboard.controller;

import com.dailycoding.blogboard.domain.user.User;
import com.dailycoding.blogboard.dto.BoardRequestDto;
import com.dailycoding.blogboard.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/posts")
public class BoardController {

    private final BoardService boardService;

    @PostMapping
    public ResponseEntity<Long> createBoard(@RequestBody BoardRequestDto requestDto){
        // TODO : 로그인 사용자 정보 연동 전, 임시 user 객체 생성
        User dummyUser = User.builder()
                .username("testuser")
                .email("test@example.com")
                .password("1234")
                .build();
        Long boardId = boardService.save(requestDto, dummyUser);
        return ResponseEntity.ok(boardId);
    }

}
