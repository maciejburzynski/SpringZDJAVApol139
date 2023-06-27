package pl.sda.ZDJAVApol139.shelter;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ShelterRestController {
    // @RestController
//    @Target({ElementType.TYPE})
//    @Retention(RetentionPolicy.RUNTIME)
//    @Documented
//    @Controller
//    @ResponseBody
//      @Controller:
//    @Target(ElementType.TYPE)
//    @Retention(RetentionPolicy.RUNTIME)
//    @Documented
//    @Component
// @Component @Service @Bean @Repository


    private final ShelterService shelterService;

    @PostMapping("/api/shelters")
    public ResponseEntity addShelter(Shelter shelter) {
        shelterService.addShelter(shelter);
        return ResponseEntity
                .status(201)
                .build();
    }

    @GetMapping("/api/shelters")
    public ResponseEntity<List<Shelter>> findAllShelters() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(shelterService.getAllShelters());
    }


}
