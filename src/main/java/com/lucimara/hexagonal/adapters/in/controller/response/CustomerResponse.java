package com.lucimara.hexagonal.adapters.in.controller.response;

import com.lucimara.hexagonal.application.core.domain.Address;

public class CustomerResponse {

    private String name;
    private AddressResponse address;
    private String cpf;
    private Boolean isValidCpf;
}
