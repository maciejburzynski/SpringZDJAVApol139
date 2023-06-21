package pl.sda.ZDJAVApol139.dog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DogViewController {

    @GetMapping(path = "/dogs")
    public String getDogs(){
        return "dogs";
    }
}
