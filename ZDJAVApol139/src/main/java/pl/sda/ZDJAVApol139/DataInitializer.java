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
import pl.sda.ZDJAVApol139.dog.DogBreed;
import pl.sda.ZDJAVApol139.dog.DogService;
import pl.sda.ZDJAVApol139.shelter.Shelter;
import pl.sda.ZDJAVApol139.shelter.ShelterService;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

import static java.util.Set.*;
import static pl.sda.ZDJAVApol139.dog.DogBreed.*;

@Component
@RequiredArgsConstructor
public class DataInitializer {

    private final DogService dogService;
    private final CatService catService;
    private final AddressService addressService;
    private final ShelterService shelterService;

    @PostConstruct
    void addData() {
        addShelters();
    }

    void addShelters() {
        Dog dog = new Dog("Max",
                BigDecimal.valueOf(100.00),
                MIX,
                "https://img.freepik.com/free-photo/isolated-happy-smiling-dog-white-background-portrait-4_1562-693.jpg?w=996&t=st=1687287351~exp=1687287951~hmac=9cbefe71dc4a92b0868489da3d1644fb51e35d7f3d0c112c25f3d26e030c2739");
        Dog dog1 = new Dog("Szrik",
                BigDecimal.valueOf(150.00),
                DOBERMAN,
                "https://t3.gstatic.com/licensed-image?q=tbn:ANd9GcTBI6YWrsgd1hW1FPNYQcmYHVanQuzfkr1nkWKT1Vlyk6IUjBjiKgMhmrcGYf5AcZui");
        Address address = new Address("Pilsudzkiego", 10, "90-000", "Lodzkie", "Lodz");
        Address address1 = new Address("Mickiewicza", 65, "90-001", "Lodzkie", "Koluszki");

        Shelter shelter = new Shelter("Psiakowo", List.of(dog), address);
        Shelter shelter1 = new Shelter("Psiecko", List.of(dog1), address1);

        shelterService.addShelter(shelter);
        shelterService.addShelter(shelter1);

    }

//    void addDogs() {
//        Dog dog = new Dog("Max", BigDecimal.valueOf(100.00));
//        Dog dog1 = new Dog("Szrik", BigDecimal.valueOf(150.00));
//        Dog dog2 = new Dog("Andrzej", BigDecimal.valueOf(120.00));
//        Dog dog3 = new Dog("Reksio", BigDecimal.valueOf(2500.0));
//
//    }

    void addCats() {
        Cat cat = new Cat("Kat");
        Cat cat1 = new Cat("Filemon");
        Cat cat2 = new Cat("Nelson");

        catService.addCat(cat);
        catService.addCat(cat1);
        catService.addCat(cat2);
    }
}
