package pl.sda.ZDJAVApol139.dog;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<Dog>> findAllDogs() {
        return ResponseEntity
                .status(200)
                .header("group-name","ZDJAVApol139")
                .body(dogService.findAllDogs());
    }

    @PostMapping(path = "/api/dogs")
    public void addDog(@RequestBody Dog dog) {
        dogService.addDog(dog);
    }

    @PostMapping(path = "/api/dogs/set")
    public void addDogs(@RequestBody Set<Dog> dogs) {
        dogService.addDogs(dogs);
    }

}
