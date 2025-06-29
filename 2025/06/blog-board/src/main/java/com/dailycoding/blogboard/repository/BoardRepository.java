package com.dailycoding.blogboard.repository;

import com.dailycoding.blogboard.domain.board.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
