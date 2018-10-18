package ua.com.threedob.service;

import ua.com.threedob.entity.User;

import java.util.List;

/**
 * Created by Yurij on 17.08.2017.
 */
public interface UserService{

    void save(User user);
    void save(String name,String surName,String email,String password);
    User findOne(int id);
    List<User> findAll();
    List<User> fetchPurchase();
    User findByEmail(String s);
}
