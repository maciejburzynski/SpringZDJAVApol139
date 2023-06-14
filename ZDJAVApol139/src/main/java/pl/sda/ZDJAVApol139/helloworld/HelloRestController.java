package pl.sda.ZDJAVApol139.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @GetMapping("/api/hello-world")
    public String helloWorld(){
        return "Hello World";
    }
}
