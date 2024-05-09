package com.lucimara.hexagonal.adapters.in.consumer;

import com.lucimara.hexagonal.adapters.in.consumer.mapper.CustomerMessageMapper;
import com.lucimara.hexagonal.adapters.in.consumer.message.CustomerMessage;
import com.lucimara.hexagonal.application.ports.in.UpdateCustomerInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;

public class ReceivedValidatedCpfConsumer {

    @Autowired
    private UpdateCustomerInputPort updateCustomerInputPort;

    @Autowired
    private CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics = "tp-cpf-validate", groupId = "lucimara")
    public void receive(CustomerMessage customerMessage) {
        var customer = customerMessageMapper.toCustomer(customerMessage);
        updateCustomerInputPort.update(customer, customerMessage.getZipCode());

    }
}
