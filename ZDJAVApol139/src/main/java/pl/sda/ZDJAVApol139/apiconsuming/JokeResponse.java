package pl.sda.ZDJAVApol139.apiconsuming;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class JokeResponse {
//POJO -> jokeResponse.getPunchline()
    String type;
    String setup;
    String punchline;
    Integer id;
}
