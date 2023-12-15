package com.sqlConnect.DbCRUD.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    private int id;
    private String name;
    private String address;
    private int phoneNo;
}
