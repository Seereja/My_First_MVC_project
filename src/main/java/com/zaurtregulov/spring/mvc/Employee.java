package com.zaurtregulov.spring.mvc;


import com.zaurtregulov.spring.mvc.validation.CheckEmail;
import jakarta.validation.constraints.*;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Employee {
    @Size(min = 2, message = "name must be more two symbols")
    private String name;
    @Size(min = 2, message = "surname must be more two symbols")
    @NotBlank(message = "surname is required field")
    private String surname;
    @Min(value = 500, message = "must be greater then 499")
    @Max(value = 1000, message = "must be less then 1001")
    private int salary;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "pleas use pattern XXX-XX-XX")
    private String phoneNumber;
    private String department;
    @CheckEmail(value = "abc.com", message = "email must end with abc.com")
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private Map<String, String> departments;
    private Map<String, String> carBrands;

    private String carBrand;

    private String[] languages;

    private Map<String, String> languageList;

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information Technology");
        departments.put("HR", "Human Resourses");
        departments.put("Sales", "Sales");

        carBrands = new HashMap<>();
        carBrands.put("BMW", "BMW");
        carBrands.put("LADA", "LADA");
        carBrands.put("AUDI", "AUDI");

        languageList = new HashMap<>();
        languageList.put("EN", "Englesh");
        languageList.put("DE", "Deutch");
        languageList.put("FR", "Franch");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    public Map<String, String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(Map<String, String> languageList) {
        this.languageList = languageList;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
