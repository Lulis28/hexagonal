package com.lucimara.hexagonal.config;

import com.lucimara.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.lucimara.hexagonal.adapters.out.FindCustomerByIdAdapter;
import com.lucimara.hexagonal.adapters.out.InsertCustomerAdapter;
import com.lucimara.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.lucimara.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCase FindCustomerByIdUseCase(
               FindCustomerByIdAdapter findCustomerByIdAdapter
    ) {
            return new FindCustomerByIdUseCase(findCustomerByIdAdapter);
    }
}
