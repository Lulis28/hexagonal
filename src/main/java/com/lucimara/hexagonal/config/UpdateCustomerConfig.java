package com.lucimara.hexagonal.config;

import com.lucimara.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.lucimara.hexagonal.adapters.out.FindCustomerByIdAdapter;
import com.lucimara.hexagonal.adapters.out.InsertCustomerAdapter;
import com.lucimara.hexagonal.adapters.out.UpdateCustomerAdapter;
import com.lucimara.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.lucimara.hexagonal.application.core.usecase.InsertCustomerUseCase;
import com.lucimara.hexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter
    ){
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCustomerAdapter);
    }
}
