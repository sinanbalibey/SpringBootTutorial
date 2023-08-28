package com.Crud.RestfullCrud.rest;


import com.Crud.RestfullCrud.dao.EmployeeDao;
import com.Crud.RestfullCrud.entity.Employee;
import com.Crud.RestfullCrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {


    private EmployeeService employeeService;


    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return  employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId){

        Employee employee=employeeService.findById(employeeId);

        if(employee==null){
            throw  new RuntimeException("Employee id not found - "+employeeId);
        }
        return employee;
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee theEmployee){

        theEmployee.setId(0);

        Employee employee1=employeeService.save(theEmployee);

        return employee1;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee theEmployee){
        Employee dbEmployee=employeeService.save(theEmployee);

        return dbEmployee;
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId){

        Employee tempEmployee=employeeService.findById(employeeId);

        if(tempEmployee==null){
            throw  new RuntimeException("Böyle bir id ye aıd kullanıcı yok -"+employeeId);

        }
        employeeService.deleteById(employeeId);

        return employeeId+" id numarasına sahip kullanıcı silindi";

    }

}
