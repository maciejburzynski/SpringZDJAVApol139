package pl.sda.ZDJAVApol139.dog;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequiredArgsConstructor
public class DogRestController {
//    RestController -> Service -> Repository -> IRepository

    private final DogService dogService;

    @GetMapping(path = "/api/dogs")
//    @RequestMapping(path = "/api/dogs", method = GET)
    public List findAllDogs() {
        return dogService.findAllDogs();
    }

    @PostMapping(path = "/api/dogs")
    public void addDog(@RequestBody Dog dog) {
        dogService.addDog(dog);
    }

    @PostMapping(path = "/api/dogs")
    public void addDogs(@RequestBody Set<Dog> dogs) {
        dogService.addDogs(dogs);
    }

}
