package practice.springbasic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import practice.springbasic.data.MultiFoo;
import practice.springbasic.repository.CategoryRepository;
import practice.springbasic.repository.CustomerRepository;
import practice.springbasic.repository.ProductRepository;
import practice.springbasic.service.CategoryService;
import practice.springbasic.service.CustomerService;
import practice.springbasic.service.ProductService;

public class ComponentTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testComponent() {
        ProductService productService1 = applicationContext.getBean(ProductService.class);
        ProductService productService2 = applicationContext.getBean("productService", ProductService.class);

        Assertions.assertSame(productService1, productService2);
    }

    @Test
    void testConstructorDependencyInjection() {
        ProductRepository productRepository = applicationContext.getBean(ProductRepository.class);
        ProductService productService = applicationContext.getBean(ProductService.class);

        Assertions.assertSame(productRepository, productService.getProductRepository());
    }

    @Test
    void testSetterDependencyInjection() {
        CategoryRepository categoryRepository = applicationContext.getBean(CategoryRepository.class);
        CategoryService categoryService = applicationContext.getBean(CategoryService.class);

        Assertions.assertSame(categoryRepository, categoryService.getCategoryRepository());
    }

    @Test
    //void testFieldDependencyInjection() {
    void testCustomerService() {
        //CustomerRepository customerRepository = applicationContext.getBean(CustomerRepository.class);
        //CustomerService customerService = applicationContext.getBean(CustomerService.class);

        //Assertions.assertSame(customerService.getCustomerRepository(), customerRepository);

        CustomerRepository normalCustomerRepository = applicationContext.getBean("normalCustomerRepository", CustomerRepository.class);
        CustomerRepository premiumCustomerRepository = applicationContext.getBean("premiumCustomerRepository", CustomerRepository.class);
        CustomerService customerService = applicationContext.getBean(CustomerService.class);

        Assertions.assertSame(normalCustomerRepository, customerService.getNormalCustomerRepository());
        Assertions.assertSame(premiumCustomerRepository, customerService.getPremiumCustomerRepository());
    }

    @Test
    void testObjectProvider() {
        MultiFoo multiFoo = applicationContext.getBean(MultiFoo.class);

        Assertions.assertEquals(3, multiFoo.getFoos().size());
    }
}
