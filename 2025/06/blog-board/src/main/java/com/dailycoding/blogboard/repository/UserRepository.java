package com.dailycoding.blogboard.repository;

import com.dailycoding.blogboard.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
