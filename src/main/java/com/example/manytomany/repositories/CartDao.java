package com.example.manytomany.repositories;

import com.example.manytomany.entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartDao extends JpaRepository<Cart,Integer> {
}
