package pl.sda.ZDJAVApol139.address;

import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
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

    public Address(String street, Integer streetNumber, String zipCode, String voivodeship, String city) {
        this.street = street;
        this.streetNumber = streetNumber;
        this.zipCode = zipCode;
        this.voivodeship = voivodeship;
        this.city = city;
    }
}
