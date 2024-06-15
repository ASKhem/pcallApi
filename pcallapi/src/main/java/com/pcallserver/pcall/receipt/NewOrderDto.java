package com.pcallserver.pcall.receipt;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewOrderDto {
    @Email
    @NotEmpty
    private String email;

    @NotEmpty
    private ArrayList<Long> componentsId;

    private double price;

    private LocalDate deliveryDate;

    @NotEmpty
    @Size(min = 10, max = 15)
    private String phone;

    @NotEmpty
    private String address;

    @NotEmpty
    private String city;

    @NotEmpty
    private String state;

    @NotEmpty
    @Size(min = 5, max = 10)
    private String zip;

    @NotEmpty
    private String country;
}
