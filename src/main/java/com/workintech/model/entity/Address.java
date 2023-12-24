package com.workintech.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Address", schema = "workintech")
public class Address {
    @Id
    @GeneratedValue
    private Double id;
    @Column
    private String street;
    @Column
    private Integer no;
    @Column
    private String city;
    @Column
    private String country;
    @Column
    private String description;
    @OneToOne(mappedBy = "address",cascade = {CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST,CascadeType.REFRESH})
    private Account account;
}
