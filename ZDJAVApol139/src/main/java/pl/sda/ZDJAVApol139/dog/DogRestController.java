package pl.sda.ZDJAVApol139.dog;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Set;


@RestController
@RequiredArgsConstructor
public class DogRestController {
//    RestController -> Service -> Repository -> IRepository extends JPA/CRUDRepository

    private final DogService dogService;

    @GetMapping(path = "/api/dogs")
//    /dogs
    public ResponseEntity<List<Dog>> findAllDogs(HttpServletRequest httpServletRequest) {
        String customHeader = httpServletRequest.getHeader("hello-world");

        return ResponseEntity
                .status(200)
                .header("group-name", "ZDJAVApol139")
                .body(dogService.findAllDogs());
    }

//    @Secured(value = "ROLE_USER")
    @PostMapping(path = "/api/dogs")
    public ResponseEntity addDog(@RequestBody Dog dog,
                                 HttpServletResponse httpServletResponse) {
        dogService.addDog(dog);

        Cookie cookie = new Cookie("group-name", "ZDJAVApol139");
        httpServletResponse.addCookie(cookie);
        httpServletResponse.setHeader("eluwina", "byku");

        return ResponseEntity
                .status(201)
                .build();
    }

    @PostMapping(path = "/api/dogs/set")
    public void addDogs(@RequestBody Set<Dog> dogs) {
        dogService.addDogs(dogs);
    }

    //Exception handling in REST api:
    //        -try/catch
    //        -global exception handler





    @GetMapping("/api/dogs/{id}")
    public ResponseEntity findDogById(@PathVariable Long id) {
        return ResponseEntity
                .status(200)
                .body(dogService.findDogById(id));
    }

//    PUT - Resource update
//    PATCH - Part of resource update

    @PutMapping("api/dogs/{id}")
    public ResponseEntity updateDogById(@PathVariable Long id,@RequestBody Dog dog){
        dogService.updateDogById(id, dog);
        return ResponseEntity.status(204).build();
    }


}



