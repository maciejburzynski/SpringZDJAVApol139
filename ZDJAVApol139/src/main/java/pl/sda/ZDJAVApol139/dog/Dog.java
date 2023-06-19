package pl.sda.ZDJAVApol139.dog;

import lombok.*;

import javax.persistence.*;

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

    public Dog(String name) {
        this.name = name;
    }
}
