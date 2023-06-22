package pl.sda.ZDJAVApol139.dog;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "DOGS")
public class Dog {
//POJO - Plain Old Java Object -> Model class
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    BigDecimal price;

    public Dog(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }
}
