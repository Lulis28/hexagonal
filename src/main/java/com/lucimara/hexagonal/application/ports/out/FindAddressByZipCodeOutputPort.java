package com.lucimara.hexagonal.application.ports.out;

import com.lucimara.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);

}
