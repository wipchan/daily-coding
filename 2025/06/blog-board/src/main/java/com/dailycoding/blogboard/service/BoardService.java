package com.dailycoding.blogboard.service;

import com.dailycoding.blogboard.domain.board.Board;
import com.dailycoding.blogboard.domain.user.User;
import com.dailycoding.blogboard.dto.BoardRequestDto;
import com.dailycoding.blogboard.repository.BoardRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    @Transactional
    public Long save(BoardRequestDto requestDto, User user){
        Board board = requestDto.toEntity(user);
        return boardRepository.save(board).getId();
    }
}
