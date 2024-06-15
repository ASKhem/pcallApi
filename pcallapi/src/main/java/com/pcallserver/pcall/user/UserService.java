package com.pcallserver.pcall.user;

import com.pcallserver.pcall.user.domain.User;

import com.pcallserver.pcall.user.dto.NewUserDto;

import java.util.List;

public interface UserService {
    public User createUser(User user);

    public User getUser(Long id);

    public List<User> getUsers();

    public User updateUser(User user);

    public void deleteUser(Long id);

    public User convertNewDto(NewUserDto newUserDto);

    public User findByName(String name);

    public String getCurrentUserRole();

    public boolean isAdmin();

    public User getUserByToken(String token);

    public User findByEmail(String email);

    public void deleteUserByToken(String token);
}
