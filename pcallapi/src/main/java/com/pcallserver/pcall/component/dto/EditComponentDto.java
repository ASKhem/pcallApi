package com.pcallserver.pcall.component.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EditComponentDto {

    private String details;
    private double price;
    private String image;
}
