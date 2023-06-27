package pl.sda.ZDJAVApol139.helloworld;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.ZDJAVApol139.apiconsuming.ApiService;
import pl.sda.ZDJAVApol139.apiconsuming.JokeResponse;
import pl.sda.ZDJAVApol139.configuration.CustomConfiguration;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
public class HelloRestController {

    private final CustomConfiguration customConfiguration;
    private final ApiService apiService;

    @GetMapping("/api/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/api/custom")
    public String helloCustomWorld() {
        return customConfiguration.getCommunicate();
    }

    @GetMapping("/api/custom-with-value")
    public String helloCustomWithValueWorld(@Value("${custom-property.value:eluwina}") final String value) {
        return value;
    }
    @GetMapping("/api/my-first-api-consuming")
    public ResponseEntity helloApiConsumer() {
        try {
            return ResponseEntity.status(200).body(apiService.callApi());
        } catch (IOException e) {
            return ResponseEntity.status(404).body(e.getMessage());
        } catch (InterruptedException e) {
            return ResponseEntity.status(500).body(e.getMessage());
        }
    }


}
