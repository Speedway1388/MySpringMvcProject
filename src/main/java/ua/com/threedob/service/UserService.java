package ua.com.threedob.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import ua.com.threedob.dao.UserDAO;
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
}
