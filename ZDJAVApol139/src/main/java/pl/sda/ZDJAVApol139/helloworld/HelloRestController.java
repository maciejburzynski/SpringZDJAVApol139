package pl.sda.ZDJAVApol139.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @GetMapping
    public String helloWorld(){
        return "Hello World";
    }
}
