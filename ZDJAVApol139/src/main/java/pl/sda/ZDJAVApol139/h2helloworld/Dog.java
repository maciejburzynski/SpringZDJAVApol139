package pl.sda.ZDJAVApol139.h2helloworld;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Dog {
//POJO - Plain Old Java Object -> Model class
    @Id
    Long id;
    String name;
}
