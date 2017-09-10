package ua.com.threedob.service;

import ua.com.threedob.entity.Purchase;

import java.util.List;

/**
 * Created by Yurij on 23.08.2017.
 */
public interface PurchaseService {
    void save(Purchase purchase);
    Purchase findOne(int id);
    List<Purchase> findAll();
    void delete(int id);



}
