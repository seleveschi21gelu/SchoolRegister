package org.example.exception;

import org.example.entity.Register;

public class RegisterException extends RuntimeException {

    public RegisterException( int id) {
        System.out.println("Does not found id: " + id);

    }
}
