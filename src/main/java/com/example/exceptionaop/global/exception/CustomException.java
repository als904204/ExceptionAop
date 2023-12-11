package com.example.exceptionaop.global.exception;

import com.example.exceptionaop.global.exception.ExceptionCode.ExceptionCode;
import lombok.Getter;

public class CustomException extends RuntimeException {
    @Getter
    private ExceptionCode exceptionCode;

    public CustomException(ExceptionCode exceptionCode) {
        super(exceptionCode.getMessage());
        this.exceptionCode = exceptionCode;
    }
}