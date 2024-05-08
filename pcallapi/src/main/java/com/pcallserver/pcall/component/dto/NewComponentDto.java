package com.pcallserver.pcall.component.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewComponentDto {

    private String category;
    private String brand;
    private String model;
    private String details;
    private String state;
    private double price;
    private int releaseYear;
    private int stock;
    private String image;

}
