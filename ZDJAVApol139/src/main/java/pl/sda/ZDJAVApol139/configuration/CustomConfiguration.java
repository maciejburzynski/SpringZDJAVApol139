package pl.sda.ZDJAVApol139.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "zdjava139.custom-properties")
public class CustomConfiguration {

    String communicate;

}
