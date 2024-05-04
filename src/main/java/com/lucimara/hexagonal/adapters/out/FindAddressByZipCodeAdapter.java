package com.lucimara.hexagonal.adapters.out;

import com.lucimara.hexagonal.adapters.out.client.FindAddressByZipCodeClient;
import com.lucimara.hexagonal.adapters.out.client.mapper.AddresResponseMapper;
import com.lucimara.hexagonal.application.core.domain.Address;
import com.lucimara.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddresResponseMapper addresResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addresResponseMapper.toAddress(addressResponse);
    }
}
