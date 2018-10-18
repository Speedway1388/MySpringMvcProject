package ua.com.threedob.service;

import ua.com.threedob.entity.Product;

import java.util.List;

/**
 * Created by Yurij on 17.08.2017.
 */
public interface ProductService {
    void save(String name,  String description, int price);
    Product findOne(int id);
    List<Product> findAll();
    List<Product> findByName(String name);
}
