package com.pcallserver.pcall.receipt;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.pcallserver.pcall.component.domain.Component;
import com.pcallserver.pcall.user.domain.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
public class PurchaseOrder {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private User user;

    @ManyToMany
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<Component> pc;

    private double price;

    private LocalDate deliveryDate;

    private String phone;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String country;
    private boolean delivered;
}