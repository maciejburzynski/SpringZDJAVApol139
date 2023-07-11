package pl.sda.ZDJAVApol139.helloworld;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringBootTest
@AutoConfigureMockMvc
class HelloRestControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void whenCallingHelloWorldEndpointThenShouldReturnHelloWorld() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/api/hello-world"))
                .andDo(print())
                .andExpect(MockMvcResultMatchers.content().string("Hello World"));

    }

    @Test
    void whenCallingCustomMessageEndpointThenShouldReturnHelloWorldFromZDJava139PL() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/api/custom"))
                .andDo(print())
                .andExpect(MockMvcResultMatchers.content().string("Hello ZDJava139PL from Lodz"));

    }
}