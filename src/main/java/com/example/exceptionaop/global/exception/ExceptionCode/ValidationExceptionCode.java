package com.example.exceptionaop.global.exception.ExceptionCode;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum ValidationExceptionCode implements ExceptionCode {

    INVALID_LOCATION(400, "Invalid location value"),
    INVALID_STATE(400, "Invalid state value");

    @Getter
    private int status;

    @Getter
    private String message;
}
