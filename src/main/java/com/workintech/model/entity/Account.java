package com.workintech.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Account",schema = "workintech")
public class Account {
    @Id
    @GeneratedValue
    private Double id;
    @Column
    private String accountName;
    @Column
    private Double moneyAmount;
    @Column
    private Double costumer_id;
    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
            CascadeType.REFRESH})
    @JoinColumn(name="costumer_id")
    private Costumer costumer;

}
