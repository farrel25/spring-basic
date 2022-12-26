package practice.springbasic;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "practice.springbasic.service",
        "practice.springbasic.repository",
        "practice.springbasic.configuration"
})
public class ComponentConfiguration {
}
