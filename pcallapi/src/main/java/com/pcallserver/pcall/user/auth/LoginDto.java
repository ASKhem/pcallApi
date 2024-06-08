package com.pcallserver.pcall.user.auth;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class LoginDto {
    @NotBlank
    private String username;
    @NotBlank
    private String password;
}
