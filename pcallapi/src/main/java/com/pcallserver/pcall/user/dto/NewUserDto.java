package com.pcallserver.pcall.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class NewUserDto {
    @NotNull
    @Size(min = 7, max = 25)
    private String userName;
    @NotNull
    @Size(min = 7, max = 16)
    private String password;
    @Email
    @NotNull
    private String email;
}
