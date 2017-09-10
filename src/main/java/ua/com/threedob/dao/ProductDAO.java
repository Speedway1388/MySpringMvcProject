package ua.com.threedob.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.threedob.entity.Product;

/**
 * Created by Yurij on 17.08.2017.
 */
public interface ProductDAO extends JpaRepository<Product,Integer>{

}
