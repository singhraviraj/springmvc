package com.springBootmvc.springBootmvc.dto;

import java.time.LocalDate;
import java.util.Date;

public class EmployeeDto {

    private Long id;
    private String name;
    private String email;
    private Integer age;
    private LocalDate dateOFJoining;
    private boolean isActive;

    public EmployeeDto() {
    }

    public EmployeeDto(Long id, String name, String email, Integer age, LocalDate dateOFJoining, boolean isActive) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.dateOFJoining = dateOFJoining;
        this.isActive = isActive;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDateOFJoining() {
        return dateOFJoining;
    }

    public void setDateOFJoining(LocalDate dateOFJoining) {
        this.dateOFJoining = dateOFJoining;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
