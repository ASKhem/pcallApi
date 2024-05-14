package com.pcallserver.pcall.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcallserver.pcall.user.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
