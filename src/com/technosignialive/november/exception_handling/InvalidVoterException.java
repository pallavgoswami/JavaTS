package com.technosignialive.november.exception_handling;

public class InvalidVoterException extends RuntimeException {
    public InvalidVoterException(String errorMessage) {
        super(errorMessage);
    }
}
