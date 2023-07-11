package pl.sda.ZDJAVApol139.address;

import lombok.*;
import pl.sda.ZDJAVApol139.shelter.Shelter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "ADDRESSES")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String street;
    Integer streetNumber;
    String zipCode;
    String voivodeship;
    String city;
//    @OneToOne(cascade = CascadeType.ALL)
//    Shelter shelter;
//    address.getShelter();

    public Address(String street, Integer streetNumber, String zipCode, String voivodeship, String city) {
        this.street = street;
        this.streetNumber = streetNumber;
        this.zipCode = zipCode;
        this.voivodeship = voivodeship;
        this.city = city;
    }
}
