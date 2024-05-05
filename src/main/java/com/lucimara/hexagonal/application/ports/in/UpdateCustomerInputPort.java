package com.lucimara.hexagonal.application.ports.in;

import com.lucimara.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipcode);
}
