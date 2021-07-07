package com.example.manytomany.controller;

import com.example.manytomany.entities.Cart;
import com.example.manytomany.repositories.CartDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class postController {

    @Autowired
    private CartDao cartDao;

    @PostMapping("/postCart")
    public void postCart(@RequestBody Cart cart){
        cartDao.save(cart);
    }

}
