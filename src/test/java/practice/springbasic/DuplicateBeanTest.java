package practice.springbasic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import practice.springbasic.data.Foo;

public class DuplicateBeanTest {

    @Test
    void testDuplicateBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateBeanConfiguration.class);

        // ERROR -> NoUniqueBeanDefinitionException: No qualifying bean of type 'practice.springbasic.data.Foo' available: expected single matching bean but found 2: foo1,foo2
        // context.getBean(Foo.class);

        Assertions.assertThrows(NoUniqueBeanDefinitionException.class, () -> {
            Foo foo = context.getBean(Foo.class);
        });

    }

    @Test
    void getDuplicateBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateBeanConfiguration.class);

        /**
         * ACCESSING DUPLICATE BEAN
         * add the bean name explicitly as the first argument in getBean() method
         */
        Foo foo1 = context.getBean("foo1", Foo.class);
        Foo foo2 = context.getBean("foo2", Foo.class);

        Assertions.assertNotSame(foo1, foo2);
    }

}
