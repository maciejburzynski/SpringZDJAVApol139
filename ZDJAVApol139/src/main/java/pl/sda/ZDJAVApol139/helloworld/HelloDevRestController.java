package pl.sda.ZDJAVApol139.helloworld;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile(value = "dev")
public class HelloDevRestController {

    @GetMapping("/api/hello-world-dev")
    public String helloWorld(){
        return "Hello World from dev";
    }
}
