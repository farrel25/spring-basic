package practice.springbasic;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import practice.springbasic.configuration.BarConfiguration;
import practice.springbasic.configuration.FooConfiguration;

@Configuration
@Import(value = {
        FooConfiguration.class,
        BarConfiguration.class
})
public class MainConfiguration {
}
