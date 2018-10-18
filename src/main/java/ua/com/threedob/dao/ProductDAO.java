package ua.com.threedob.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ua.com.threedob.entity.Product;

import java.util.List;

/**
 * Created by Yurij on 17.08.2017.
 */
public interface ProductDAO extends JpaRepository<Product,Integer>{


    @Query("from Product u join fetch u.category where u.name = pname")
    List<Product> findByName(String pname);
}
