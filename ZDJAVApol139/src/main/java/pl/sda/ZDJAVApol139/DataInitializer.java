package pl.sda.ZDJAVApol139;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import pl.sda.ZDJAVApol139.address.Address;
import pl.sda.ZDJAVApol139.address.AddressService;
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
    private final AddressService addressService;

    @PostConstruct
    void addData() {
        addCats();
        addDogs();
        addAddresses();
    }

    void addDogs() {
        Dog dog = new Dog("Max");
        Dog dog1 = new Dog("Szrik");
        Dog dog2 = new Dog("Andrzej");
        Dog dog3 = new Dog("Reksio");

        dogService.addDog(dog);
        dogService.addDog(dog1);
        dogService.addDog(dog2);
        dogService.addDog(dog3);
    }

    void addCats() {
        Cat cat = new Cat("Kat");
        Cat cat1 = new Cat("Filemon");
        Cat cat2 = new Cat("Nelson");

        catService.addCat(cat);
        catService.addCat(cat1);
        catService.addCat(cat2);
    }

    void addAddresses() {
        Address address = new Address("Pilsudzkiego", 10, "90-000", "Lodzkie", "Lodz");
        Address address1 = new Address("Mickiewicza", 65, "90-001", "Lodzkie", "Koluszki");

        addressService.addAddress(address);
        addressService.addAddress(address1);
    }

}
