package com.example.manytomany.repositories;

import com.example.manytomany.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemDao extends JpaRepository<Item,Integer> {
}
