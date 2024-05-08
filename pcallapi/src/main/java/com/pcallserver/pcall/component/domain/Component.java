package com.pcallserver.pcall.component.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
 
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Component {

    @Id
    @GeneratedValue
    private Long id;
    private ComponentBrand brand;
    private ComponentCategory category;
    private String model;
    private String details;
    private ComponentState state;
    private double price;
    private int onSale;
    private int releaseYear;
    private int stock;
    private String image;

}
