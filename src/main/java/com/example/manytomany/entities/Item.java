package com.example.manytomany.entities;

import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Setter
@Entity
@Table(name="Item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "items")
    private Set<Cart> carts;
}
