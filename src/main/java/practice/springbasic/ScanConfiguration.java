package practice.springbasic;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "practice.springbasic.configuration"
})
public class ScanConfiguration {
}
