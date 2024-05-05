package com.lucimara.hexagonal.application.core.usecase;

import com.lucimara.hexagonal.application.ports.in.DeleteCustomerByIdInputPort;
import com.lucimara.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.lucimara.hexagonal.application.ports.out.DeleteCustomerByIdOutputPort;
import com.lucimara.hexagonal.application.ports.out.FindCustomerByIdOutputPort;

public class DeleteCustomerByIdUseCase implements DeleteCustomerByIdInputPort {

    private final FindCustomerByIdInputPort findCustomerByIdOutputPort;
    private final DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort;

    public DeleteCustomerByIdUseCase(FindCustomerByIdInputPort findCustomerByIdOutputPort, DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
        this.deleteCustomerByIdOutputPort = deleteCustomerByIdOutputPort;
    }

    @Override
    public void delete(String id) {
        findCustomerByIdOutputPort.find(id);
        deleteCustomerByIdOutputPort.delete(id);
    }
}
