package com.lucimara.hexagonal.config;

import com.lucimara.hexagonal.adapters.out.DeleteCustomerAdapter;
import com.lucimara.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.lucimara.hexagonal.adapters.out.UpdateCustomerAdapter;
import com.lucimara.hexagonal.application.core.usecase.DeleteCustomerByIdUseCase;
import com.lucimara.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            DeleteCustomerAdapter deleteCustomerAdapter
    ){
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerAdapter);
    }
}
