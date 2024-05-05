package com.lucimara.hexagonal.adapters.out;

import com.lucimara.hexagonal.adapters.out.repository.CustomerRepository;
import com.lucimara.hexagonal.application.ports.out.DeleteCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerAdapter implements DeleteCustomerByIdOutputPort{

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);
    }
}
