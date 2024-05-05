package com.lucimara.hexagonal.application.core.usecase;

import com.lucimara.hexagonal.application.core.domain.Customer;
import com.lucimara.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.lucimara.hexagonal.application.ports.out.FindCustomerByIdOutputPort;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {

    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    @Override
    public Customer find(String id) {
        return findCustomerByIdOutputPort.findById(id).orElseThrow(() -> new RuntimeException("Customer not found"));
    }
}
