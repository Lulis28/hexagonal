package com.lucimara.hexagonal.application.ports.out;

public interface SendCpfToValidationOutputPort {
    void send(String cpf);
}
