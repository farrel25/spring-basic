package practice.springbasic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import practice.springbasic.data.Foo;

@Slf4j // add logging
@Configuration
public class BeanConfiguration {
    /**
     * if this body class still empty
     * by default, it will create application context using this configuration class
     * but there's no data
     */

    /**
     * CREATE BEAN
     *
     * When we put an object into the Spring Container IoC,
     * we call the object a Bean
     * But we need add annotation @Bean
     * if we're not use @Bean, by default the method will not be recognised as Bean
     *
     * @return foo
     */
    @Bean
    public Foo foo() {
        Foo foo = new Foo();
        log.info("Create new foo Bean"); // add logging
        return foo;
    }

}
