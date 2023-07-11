package pl.sda.ZDJAVApol139.dog;

import lombok.*;
import pl.sda.ZDJAVApol139.address.Address;
import pl.sda.ZDJAVApol139.shelter.Shelter;

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
    DogBreed dogBreed; // -> DOG_BREED
//    @Transient
    String photoUrl;
//    @Embedded -> Not table, but columns consisting from fields of Object
//    Address address -> zip-code, street, city
//    @ManyToOne() if bi-directional + mappedBy = owner_of_relation
//    Shelter shelter;
// dog.getShelter -> SELECT * FROM DOGS WHERE shelter_id = some-value
    public Dog(String name, BigDecimal price, DogBreed dogBreed, String photoUrl) {
        this.name = name;
        this.price = price;
        this.dogBreed = dogBreed;
        this.photoUrl = photoUrl;
    }
}
