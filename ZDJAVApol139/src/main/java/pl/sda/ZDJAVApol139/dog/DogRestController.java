package pl.sda.ZDJAVApol139.dog;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Set;


@RestController
@RequiredArgsConstructor
@Slf4j
public class DogRestController {
//    RestController -> Service -> Repository -> IRepository

    private final DogService dogService;

    @GetMapping(path = "/api/dogs")
    public ResponseEntity<List<Dog>> findAllDogs(HttpServletRequest httpServletRequest) {
        String customHeader = httpServletRequest.getHeader("hello-world");
        log.info("Custom header value is : " + customHeader);
        log.info("Returning all dogs");

        return ResponseEntity
                .status(200)
                .header("group-name", "ZDJAVApol139")
                .body(dogService.findAllDogs());
    }

    @PostMapping(path = "/api/dogs")
    public ResponseEntity addDog(@RequestBody Dog dog,
                                 HttpServletResponse httpServletResponse) {
        dogService.addDog(dog);

        Cookie cookie = new Cookie("group-name", "ZDJAVApol139");
        httpServletResponse.addCookie(cookie);
        log.info("Adding dog: " + dog);

        return ResponseEntity
                .status(201)
                .build();
    }

    @PostMapping(path = "/api/dogs/set")
    public void addDogs(@RequestBody Set<Dog> dogs) {
        log.info("Adding dogs: " + dogs);
        dogService.addDogs(dogs);
    }

    //Exception handling in REST api:
    //        -try/catch
    //        -global exception handler
    @GetMapping("/api/dogs/{id}")
    public ResponseEntity findDogById(@PathVariable Long id) {
        log.info("Trying to get dog with id: " + id);
        try {
            return ResponseEntity
                    .status(200)
                    .body(dogService.findDogById(id));
        } catch (DogNotFoundException dogNotFoundException) {
            log.error("Unable to find a dog with id: " + id);
            System.out.println("Unable to find a dog with id: " + id);
            return ResponseEntity
                    .status(404)
                    .body(dogNotFoundException.getMessage());
        }
    }


}
