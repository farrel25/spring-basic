package practice.springbasic.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import practice.springbasic.data.Foo;

@Configuration
public class FooConfiguration {

    @Bean
    public Foo foo() {
        return new Foo();
    }
}
