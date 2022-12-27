package practice.springbasic;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import practice.springbasic.factory.PaymentGatewayClientFactoryBean;

@Configuration
@Import(value = {
        PaymentGatewayClientFactoryBean.class
})
public class FactoryConfiguration {
}
