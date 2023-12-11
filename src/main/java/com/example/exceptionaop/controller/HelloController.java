package com.example.exceptionaop.controller;

import com.example.exceptionaop.global.exception.CustomException;
import com.example.exceptionaop.global.exception.ExceptionCode.LogicExceptionCode;
import com.example.exceptionaop.global.exception.ExceptionCode.ValidationExceptionCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/error")
public class HelloController {

    @GetMapping("/logic")
    public String errorPage1() {
        if (true) {
            throw new CustomException(LogicExceptionCode.BAD_REQUEST);
        }
        return "error";
    }

    @GetMapping("/validate")
    public String errorPage2() {
        if (true) {
            throw new CustomException(ValidationExceptionCode.INVALID_STATE);
        }
        return "error";
    }
}

