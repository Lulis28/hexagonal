package com.lucimara.hexagonal.adapters.out;

import com.lucimara.hexagonal.adapters.out.repository.CustomerRepository;
import com.lucimara.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.lucimara.hexagonal.application.core.domain.Customer;
import com.lucimara.hexagonal.application.ports.out.InsertCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;

public class InsertCustomerAdapter implements InsertCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;
    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerRepository);
    }
}
