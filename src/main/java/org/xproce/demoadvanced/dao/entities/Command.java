package org.xproce.demoadvanced.dao.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "commandes")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Command {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String designation;
    private int qte;
    private double totalPrice;

    @ManyToMany
    private Collection<Product> products = new ArrayList<>();
}

