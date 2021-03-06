package ua.com.threedob.service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.threedob.dao.UserDAO;
import ua.com.threedob.entity.User;
import ua.com.threedob.service.UserService;

import java.util.List;

/**
 * Created by Yurij on 17.08.2017.
 */
@Service

@Transactional

public class UserServiceImpl implements UserService,UserDetailsService{
    @Autowired
    private UserDAO userDAO;
    @Autowired
    private PasswordEncoder passwordEncoder;
//    public void save(User user){
//        userDAO.save(user);
//
//    }


    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    public void save(String name, String surName, String email, String password) {
        if (!(name == null||surName==null||email==null||password==null)) {
            userDAO.save(new User(name,surName,email,passwordEncoder.encode(password)));
            }

    }

    @Override
    public User findOne(int id) {
        return userDAO.findOne(id);
    }

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }

    @Override
    public List<User> fetchPurchase() {
        return userDAO.fetchPurchase();
    }

    @Override
    public User findByEmail(String s) {
        return userDAO.findByEmail(s);
    }


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return findByEmail(s);
    }
}
