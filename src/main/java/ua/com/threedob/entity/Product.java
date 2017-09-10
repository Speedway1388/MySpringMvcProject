package ua.com.threedob.entity;

import lombok.*;

import javax.persistence.*;

/**
 * Created by Yurij on 17.08.2017.
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private int id;
    private String name;
    private int price;
    private String description;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private ProductCategory category;
    @ManyToOne(fetch = FetchType.LAZY)
    private Purchase purchase;


 //   private Purchase order
    public Product(String name, int price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }
}
