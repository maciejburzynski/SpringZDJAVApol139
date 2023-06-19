package pl.sda.ZDJAVApol139.cat;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api")
public class CatRestController {

    private final CatService catService;


    @GetMapping(path = "/cats")
    public ResponseEntity<List<Cat>> findAllCats() {
        return ResponseEntity
                .status(200)
                .body(catService.findAllCats());
    }

    @PostMapping(path = "/cats")
    public ResponseEntity addCat(@RequestBody Cat cat){
        catService.addCat(cat);
        return ResponseEntity
                .status(201)
                .build();
    }
}
