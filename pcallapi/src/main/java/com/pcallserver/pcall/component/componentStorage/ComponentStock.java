package com.pcallserver.pcall.component.componentStorage;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ComponentStock {
    @Id
    private Long id;
    private int stock;
}
