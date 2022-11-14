package practice.springbasic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import practice.springbasic.data.Bar;
import practice.springbasic.data.Foo;

@Configuration
@Slf4j
public class DependsOnConfiguration {

    @Lazy
    @Bean
    @DependsOn(value = {"bar"})
    public Foo foo() {
        log.info("Create new Foo");
        return new Foo();
    }

    @Bean
    public Bar bar() {
        log.info("Create new Bar");
        return new Bar();
    }
}
