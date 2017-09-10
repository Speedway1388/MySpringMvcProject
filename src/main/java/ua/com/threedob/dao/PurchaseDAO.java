package ua.com.threedob.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.threedob.entity.Purchase;

/**
 * Created by Yurij on 23.08.2017.
 */
public interface PurchaseDAO extends JpaRepository<Purchase,Integer>{


}
