package com.example.manytomany.entities;

import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Setter
@Entity
@Table(name="Cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name="Cart_Item",
            joinColumns = {
                    @JoinColumn(name="cart_id",referencedColumnName = "id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name="item_id",referencedColumnName = "id")
            }
    )
    private Set<Item> items;
}
