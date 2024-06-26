package com.pcallserver.pcall.user;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.pcallserver.pcall.security.JwtUtils;
import com.pcallserver.pcall.user.domain.User;
import com.pcallserver.pcall.user.dto.NewUserDto;
import com.pcallserver.pcall.user.domain.Rol;

import java.util.List;

@Service
public class UserServiceImplBD implements UserService {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtUtils jwtUtils;

    public User createUser(User user) {
        String encryptedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encryptedPassword);
        try {
            return userRepository.save(user);
        } catch (DataIntegrityViolationException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<User> getUsers() {
        return userRepository.findByRole(Rol.USER);
    }

    public User getUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public User convertNewDto(NewUserDto newUserDto) {
        return modelMapper.map(newUserDto, User.class);
    }

    public User findByName(String name) {
        return userRepository.findByUsername(name);
    }

    public String getCurrentUserRole() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            return authentication.getName();
        }
        return null;
    }

    public boolean isAdmin() {
        return getCurrentUserRole().equals("[ROLE_ADMIN]");
    }

    @Override
    public User getUserByToken(String token) {
        String username = jwtUtils.getUserNameFromJwtToken(token);
        System.out.println(username);
        return userRepository.findByUsername(username);
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public void deleteUserByToken(String token) {
        User user = getUserByToken(token);
        userRepository.delete(user);
    }

}
