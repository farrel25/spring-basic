package practice.springbasic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import practice.springbasic.data.Foo;

@Configuration
public class PrimaryBeanConfiguration {

    /**
     * ANNOTATION @Primary
     * By choosing one of the duplicated beans to be the primary using the @Primary annotation,
     * automatically if we access the bean without mentioning the name of the bean,
     * the primary will be automatically selected
     *
     * @return Foo object
     */
    @Primary
    @Bean
    public Foo foo1() {
        return new Foo();
    }

    @Bean
    public Foo foo2() {
        return new Foo();
    }

}
