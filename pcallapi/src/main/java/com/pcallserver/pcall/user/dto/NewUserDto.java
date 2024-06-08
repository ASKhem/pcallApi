package com.pcallserver.pcall.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewUserDto {
    @Size(min = 7, max = 25)
    private String userName;
    @Size(min = 7, max = 16)
    private String password;
    @Email
    private String email;
}
