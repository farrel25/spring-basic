package practice.springbasic.service;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import practice.springbasic.repository.CustomerRepository;

@Component
public class CustomerService {

    //@Getter
    //@Autowired
    //private CustomerRepository customerRepository;

    @Getter
    private final CustomerRepository normalCustomerRepository;

    @Getter
    private CustomerRepository premiumCustomerRepository;

    public CustomerService(@Qualifier(value = "normalCustomerRepository") CustomerRepository normalCustomerRepository) {
        this.normalCustomerRepository = normalCustomerRepository;
    }

    @Autowired
    public void setPremiumCustomerRepository(@Qualifier(value = "premiumCustomerRepository") CustomerRepository premiumCustomerRepository) {
        this.premiumCustomerRepository = premiumCustomerRepository;
    }
}
