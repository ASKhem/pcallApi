package com.pcallserver.pcall.user;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pcallserver.pcall.user.domain.User;
import com.pcallserver.pcall.user.dto.NewUserDto;

@Service
public class UserServiceImplBD implements UserService{

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    UserRepository userRepository;

    public User createUser(User user){
        return userRepository.save(user);
    }

    public User getUser(Long id){
        return userRepository.findById(id).orElse(null);
    }

    public User updateUser(User user){
        return userRepository.save(user);
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }

    public User convertNewDto(NewUserDto newUserDto){
        return modelMapper.map(newUserDto, User.class);
    }
}
