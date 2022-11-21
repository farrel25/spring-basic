package practice.springbasic.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import practice.springbasic.data.Bar;

@Configuration
public class BarConfiguration {

    @Bean
    public Bar bar() {
        return new Bar();
    }
}
