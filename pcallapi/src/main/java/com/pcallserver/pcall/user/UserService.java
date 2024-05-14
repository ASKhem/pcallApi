package com.pcallserver.pcall.user;

import com.pcallserver.pcall.user.domain.User;
import com.pcallserver.pcall.user.dto.NewUserDto;

public interface UserService {
    public User createUser(User user);
    public User getUser(Long id);
    public User updateUser(User user);
    public void deleteUser(Long id);
    public User convertNewDto(NewUserDto newUserDto);
}
