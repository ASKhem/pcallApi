package com.pcallserver.pcall.user.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pcallUser")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String userName;
    @NotNull
    private String password;
    @Email
    private String email;

    //Billing information
    private String bankName;
    private String accountNumber;
    private String billingAddress;

}
