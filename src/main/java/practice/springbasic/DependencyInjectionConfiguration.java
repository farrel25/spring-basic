package practice.springbasic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import practice.springbasic.data.Bar;
import practice.springbasic.data.Foo;
import practice.springbasic.data.FooBar;

@Configuration
public class DependencyInjectionConfiguration {

    @Bean
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public Bar bar() {
        return new Bar();
    }

    @Bean
    public FooBar fooBar(Foo foo, Bar bar) {
        return new FooBar(foo, bar);
    }
}
