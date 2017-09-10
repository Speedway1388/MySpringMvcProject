package ua.com.threedob.service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.threedob.dao.ProductCategoryDAO;
import ua.com.threedob.entity.ProductCategory;
import ua.com.threedob.service.ProductCategoryService;

@Service
@Transactional
/**
 * Created by Yurij on 17.08.2017.
 */
public class ProductCategoryServiceImpl implements ProductCategoryService{
    @Autowired
    ProductCategoryDAO categoryDAO;


    @Override
    public void save(String name, String description) {
        categoryDAO.save(new ProductCategory(name, description));
    }
    @Override
    public void delete(int id) {
        categoryDAO.delete(id);
    }
}
