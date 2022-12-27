package practice.springbasic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import practice.springbasic.data.Bar;
import practice.springbasic.data.Foo;
import practice.springbasic.data.FooBar;

import java.util.Optional;

@Configuration
public class OptionalConfiguration {

    @Bean
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public FooBar fooBar(Optional<Foo> foo, Optional<Bar> bar) {
        return new FooBar(foo.orElse(null), bar.orElse(null));
    }
}
