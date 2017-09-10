package ua.com.threedob.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.threedob.entity.ProductCategory;

/**
 * Created by Yurij on 17.08.2017.
 */
public interface ProductCategoryDAO extends JpaRepository<ProductCategory,Integer>{


}
