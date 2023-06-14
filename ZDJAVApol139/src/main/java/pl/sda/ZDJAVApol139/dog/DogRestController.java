package pl.sda.ZDJAVApol139.dog;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class DogRestController {
//    RestController -> Service -> Repository -> IRepository

    private final DogService dogService;

    @GetMapping(path = "/api/dogs")
    public List findAllDogs() {
        return dogService.findAllDogs();
    }

    @PostMapping(path = "/api/dogs")
    public void addDog(@RequestBody Dog dog) {
        dogService.addDog(dog);
    }
}
