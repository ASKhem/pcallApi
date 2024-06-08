package com.pcallserver.pcall.receipt;

import java.time.LocalDate;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.pcallserver.pcall.component.domain.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
public class Order {
    @Id
    private Long id;

    private Long userId;

    @ManyToMany
    @OnDelete(action = OnDeleteAction.CASCADE)
    private ArrayList<Component> pc;

    private double price;

    private LocalDate deliveryDate;
}
