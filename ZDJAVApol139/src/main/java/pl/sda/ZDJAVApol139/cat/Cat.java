package pl.sda.ZDJAVApol139.cat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CATS")
public class Cat {
//JAVA -> Cat / DB -> CAT
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    BigDecimal price;
//JPA -> Java Persistence API -> Hibernate implementation of JPA
    public Cat(String name) {
        this.name = name;
    }
}
