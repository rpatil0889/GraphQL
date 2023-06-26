package com.mypoc.Controller;

import com.mypoc.exceptions.EmployeeNotFound;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ExceptionController {
    @ExceptionHandler(EmployeeNotFound.class)
    public Map<String, Object> handleEmployeeNotFoundException(EmployeeNotFound exception) {
        Map<String, Object> map = new HashMap<>();
        map.put("message", exception.getMessage());
        return map;
    }
}
