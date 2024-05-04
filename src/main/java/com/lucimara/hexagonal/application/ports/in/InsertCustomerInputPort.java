package com.lucimara.hexagonal.application.ports.in;

import com.lucimara.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {
    void insert(Customer customer, String zipCode);
}
