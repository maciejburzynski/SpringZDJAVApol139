package pl.sda.ZDJAVApol139.dog;

import lombok.*;
import pl.sda.ZDJAVApol139.address.Address;

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
    @Column(name = "PRICE_IN_PLN")
    BigDecimal price;
    @Enumerated(EnumType.STRING)
    DogBreed dogRace;
    String photoUrl;

    public Dog(String name, BigDecimal price, DogBreed dogRace, String photoUrl) {
        this.name = name;
        this.price = price;
        this.dogRace = dogRace;
        this.photoUrl = photoUrl;
    }
}
