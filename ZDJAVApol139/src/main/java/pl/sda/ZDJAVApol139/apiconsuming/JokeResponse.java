package pl.sda.ZDJAVApol139.apiconsuming;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class JokeResponse {

    String type;
    String setup;
    String punchline;
    Integer id;
}
