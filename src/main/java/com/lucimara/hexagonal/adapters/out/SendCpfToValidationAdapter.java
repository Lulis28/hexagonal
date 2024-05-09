package com.lucimara.hexagonal.adapters.out;

import com.lucimara.hexagonal.application.ports.out.SendCpfToValidationOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class SendCpfToValidationAdapter implements SendCpfToValidationOutputPort {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    @Override
    public void send(String cpf) {
        kafkaTemplate.send("tp-cpf-validation", cpf);

    }
}
