package com.springBootmvc.springBootmvc.controllers;

import com.springBootmvc.springBootmvc.dto.EmployeeDto;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping(path = "/employees")
public class EmployeesController {

    @GetMapping(path = "/getSecretPassword")
    public String getSecretKey(){
        return "Secret password : vjakbkjv9";
    }

    @GetMapping(path = "/{employeeId}")
    public EmployeeDto getEmployeeById(@PathVariable(name = "employeeId") Long Id){
        return new EmployeeDto(Id, "Raviraj", "raviraj@gmail.com", 24, LocalDate.of(2022,07,21), true);
    }

    @GetMapping
    public String getEmployee(@RequestParam(required = false) Integer age,
                              @RequestParam(required = false) String standBy){
        return "Hi age "+ age+" "+standBy;
    }

}
