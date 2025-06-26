package com.dailycoding.blogboard.dto;

import com.dailycoding.blogboard.domain.board.Board;
import com.dailycoding.blogboard.domain.user.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BoardRequestDto {
    private String title;
    private String content;

    public Board toEntity(User user){
        return Board.builder()
                .title(title)
                .content(content)
                .user(user)
                .build();
    }
}
