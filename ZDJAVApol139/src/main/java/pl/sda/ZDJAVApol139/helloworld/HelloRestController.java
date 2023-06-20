package pl.sda.ZDJAVApol139.helloworld;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.ZDJAVApol139.configuration.CustomConfiguration;

@RestController
@RequiredArgsConstructor
public class HelloRestController {

    private final CustomConfiguration customConfiguration;

    @GetMapping("/api/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/api/custom")
    public String helloCustomWorld() {
        return customConfiguration.getCommunicate();
    }


}
