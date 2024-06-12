package com.pcallserver.pcall.receipt;

import java.time.LocalDate;
import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewOrderDto {
    private String email;
    private ArrayList<Long> componentsId;
    private double price;
    private LocalDate deliveryDate;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String country;
}
