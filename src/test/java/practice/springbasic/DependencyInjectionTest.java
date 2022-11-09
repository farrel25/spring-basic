package practice.springbasic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import practice.springbasic.data.Bar;
import practice.springbasic.data.Foo;
import practice.springbasic.data.FooBar;

public class DependencyInjectionTest {

    @Test
    void testWithoutDI() {
        var foo = new Foo();
        var bar = new Bar();

        var fooBar = new FooBar(foo, bar);

        Assertions.assertSame(foo, fooBar.getFoo());
        Assertions.assertSame(bar, fooBar.getBar());
    }
}
