package practice.springbasic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextTest {

    @Test
    void testApplicationContext() {
        /**
         * CREATE APPLICATION CONTEXT
         *
         * container of spring
         * first, create configuration class -> HelloWorldConfiguration()
         * then create application context using its implementation class
         * implementation class -> AnnotationConfigApplicationContext()
         * the application context implementing polimorphism
         */
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // use assertion to make sure that the application context is not null
        Assertions.assertNotNull(context);
    }
}
