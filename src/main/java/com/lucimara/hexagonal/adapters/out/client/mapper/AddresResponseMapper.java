package com.lucimara.hexagonal.adapters.out.client.mapper;

import com.lucimara.hexagonal.adapters.out.client.response.AddressResponse;
import com.lucimara.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddresResponseMapper {
    Address toAddress(AddressResponse addressResponse);
}
