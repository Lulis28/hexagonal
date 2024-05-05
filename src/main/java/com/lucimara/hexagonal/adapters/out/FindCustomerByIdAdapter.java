package com.lucimara.hexagonal.adapters.out;

import com.lucimara.hexagonal.adapters.out.repository.CustomerRepository;
import com.lucimara.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.lucimara.hexagonal.application.core.domain.Customer;
import com.lucimara.hexagonal.application.ports.out.FindCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdAdapter implements FindCustomerByIdOutputPort {

    @Autowired
    private CustomerRepository customerRepository;
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> findById (String id){
        var customerEntity = customerRepository.findById(id);
        return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
    }
}
