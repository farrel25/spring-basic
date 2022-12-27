package practice.springbasic;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import practice.springbasic.service.MerchantServiceImpl;

@Configuration
@Import(value = {
        MerchantServiceImpl.class
})
public class InheritanceConfiguration {
}
