package pl.sda.ZDJAVApol139.shelter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.sda.ZDJAVApol139.address.Address;
import pl.sda.ZDJAVApol139.dog.Dog;

import javax.persistence.*;
import javax.swing.text.AbstractDocument;
import java.util.List;

@Entity
@Table(name = "SHELTERS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Shelter { //

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @OneToMany(cascade = CascadeType.ALL)
    List<Dog> dogs;
    @OneToOne(cascade = CascadeType.ALL)
    Address address;

    public Shelter(String name, List<Dog> dogs, Address address) {
        this.name = name;
        this.dogs = dogs;
        this.address = address;
    }

    /*
    bi-direct -> shelter.getDogs -> dog.getShelter
    single-direct -> shelter.getDogs -no->dog.getShelter
     */

}
