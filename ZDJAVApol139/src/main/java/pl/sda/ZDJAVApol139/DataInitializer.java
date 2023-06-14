package pl.sda.ZDJAVApol139;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pl.sda.ZDJAVApol139.dog.Dog;
import pl.sda.ZDJAVApol139.dog.DogService;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class DataInitializer {

    private final DogService dogService;

    @PostConstruct
    void addDogs(){
    Dog dog = new Dog("Max");
    Dog dog1 = new Dog("Szrik");
    Dog dog2 = new Dog("Andrzej");
    Dog dog3 = new Dog("Reksio");

    dogService.addDog(dog);
    dogService.addDog(dog1);
    dogService.addDog(dog2);
    dogService.addDog(dog3);

    }
}
