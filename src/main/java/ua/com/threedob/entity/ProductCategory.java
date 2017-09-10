package ua.com.threedob.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Yurij on 17.08.2017.
 */
@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "product")
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String name;
    private String description;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "category")
    private List<Product> product;

    public ProductCategory(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
