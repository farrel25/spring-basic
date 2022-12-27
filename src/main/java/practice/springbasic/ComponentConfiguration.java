package practice.springbasic;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import practice.springbasic.data.MultiFoo;

@Configuration
@ComponentScan(basePackages = {
        "practice.springbasic.service",
        "practice.springbasic.repository",
        "practice.springbasic.configuration"
})
@Import(value = {
        MultiFoo.class
})
public class ComponentConfiguration {
}
