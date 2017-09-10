package ua.com.threedob.service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.threedob.dao.PurchaseDAO;
import ua.com.threedob.entity.Purchase;
import ua.com.threedob.service.PurchaseService;

import java.util.List;
@Service
@Transactional
/**
 * Created by Yurij on 23.08.2017.
 */
public class PurchaseServiceImpl implements PurchaseService{

    @Autowired
    PurchaseDAO purchaseDAO;

    @Override
    public void save(Purchase purchase) {
        purchaseDAO.save(purchase);
    }

    @Override
    public Purchase findOne(int id) {
        return purchaseDAO.findOne(id);
    }

    @Override
    public List<Purchase> findAll() {
        return purchaseDAO.findAll();
    }

    @Override
    public void delete(int id) {
        purchaseDAO.delete(id);
    }
}
