package ua.com.threedob.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Yurij on 17.08.2017.
 */
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(mappedBy = "purchase",fetch = FetchType.LAZY)
    private List<Product> products;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;


}
