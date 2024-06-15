package com.pcallserver.pcall.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pcallserver.pcall.user.domain.Rol;
import com.pcallserver.pcall.user.domain.User;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public User findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

    public User findByEmail(String email);

    @Query("SELECT u FROM User u WHERE u.rol = :role")
    List<User> findByRole(@Param("role") Rol role);
}
