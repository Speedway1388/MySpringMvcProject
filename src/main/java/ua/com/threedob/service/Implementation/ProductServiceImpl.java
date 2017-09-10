package ua.com.threedob.service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.threedob.dao.ProductDAO;
import ua.com.threedob.entity.Product;
import ua.com.threedob.service.ProductService;

import java.util.List;

/**
 * Created by Yurij on 17.08.2017.
 */
@Service
@Transactional
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductDAO productDAO;

    @Override
    public void save(String name, String description, int price) {
        if(name!=null&&price>=0) {
            productDAO.save(new Product(name, price, description));
        }
    }

    @Override
    public Product findOne(int id) {
        return productDAO.findOne(id);
    }

    @Override
    public List<Product> findAll() {
        return productDAO.findAll();
    }
}
