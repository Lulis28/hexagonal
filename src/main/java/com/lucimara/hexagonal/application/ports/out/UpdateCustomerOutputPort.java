package com.lucimara.hexagonal.application.ports.out;

import com.lucimara.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {
    void updateCustomer(Customer customer);
}
