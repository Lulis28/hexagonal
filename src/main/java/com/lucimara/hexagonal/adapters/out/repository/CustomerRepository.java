package com.lucimara.hexagonal.adapters.out.repository;

import com.lucimara.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.lucimara.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.lucimara.hexagonal.application.core.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<CustomerRepository, String>{
}
