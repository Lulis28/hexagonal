package com.lucimara.hexagonal.config;

import com.lucimara.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.lucimara.hexagonal.adapters.out.InsertCustomerAdapter;
import com.lucimara.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter
    ){
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter);
    }
}