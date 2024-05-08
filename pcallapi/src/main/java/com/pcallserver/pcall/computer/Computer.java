package com.pcallserver.pcall.computer;

import java.util.ArrayList;

import com.pcallserver.pcall.component.domain.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Computer {
    
    @Id
    @GeneratedValue
    private Long id;
    @ManyToMany
    private ArrayList<Component> components = new ArrayList<>();
    
}
