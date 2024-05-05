package com.lucimara.hexagonal.adapters.out.repository.mapper;

import com.lucimara.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.lucimara.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {
    CustomerEntity toCustomerEntity(Customer customer);
    Customer toCustomer(CustomerEntity customerEntity);
}
