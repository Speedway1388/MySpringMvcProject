package ua.com.threedob.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ua.com.threedob.entity.Purchase;
import ua.com.threedob.entity.User;

import java.util.List;


/**
 * Created by Yurij on 17.08.2017.
 */
public interface UserDAO extends JpaRepository<User,Integer>{

    @Query("from User u join fetch u.purchase")
    List<User> fetchPurchase();

    @Query("from User u where u.email=:email")
    User findByEmail(@Param("email") String email);
}
