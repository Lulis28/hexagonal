package com.lucimara.hexagonal.adapters.in.controller.mapper;

import com.lucimara.hexagonal.adapters.in.controller.request.CustomerRequest;
import com.lucimara.hexagonal.application.core.domain.Customer;
import lombok.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);
}
