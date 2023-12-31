package pl.sda.ZDJAVApol139.apiconsuming;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


@Service
public class ApiService {


    public JokeResponse callApi() throws IOException, InterruptedException {
        HttpClient httpClient = HttpClient
                .newHttpClient();
        HttpRequest httpRequest = HttpRequest
                .newBuilder()
                .GET()
                .uri(URI.create("https://official-joke-api.appspot.com/random_joke"))
                .build();
        HttpResponse httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        ObjectMapper objectMapper = new ObjectMapper();

        return objectMapper.readValue(httpResponse.body().toString(), JokeResponse.class);
    }
}
