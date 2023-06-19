package pl.sda.ZDJAVApol139;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import pl.sda.ZDJAVApol139.cat.Cat;
import pl.sda.ZDJAVApol139.cat.CatService;
import pl.sda.ZDJAVApol139.dog.Dog;
import pl.sda.ZDJAVApol139.dog.DogService;

import javax.annotation.PostConstruct;
import java.util.Set;

import static java.util.Set.*;

@Component
@RequiredArgsConstructor
public class DataInitializer {

    private final DogService dogService;
    private final CatService catService;

    @PostConstruct
//    @EventListener(ApplicationReadyEvent.class)
    void addData() {
        Dog dog = new Dog("Max");
        Dog dog1 = new Dog("Szrik");
        Dog dog2 = new Dog("Andrzej");
        Dog dog3 = new Dog("Reksio");

        dogService.addDogs(of(dog, dog1, dog2, dog3));

        Cat cat = new Cat("Kat");
        Cat cat1 = new Cat("Fileman");
        Cat cat2 = new Cat("Nelson");

        catService.addCat(cat);
        catService.addCat(cat1);
        catService.addCat(cat2);
    }
}
