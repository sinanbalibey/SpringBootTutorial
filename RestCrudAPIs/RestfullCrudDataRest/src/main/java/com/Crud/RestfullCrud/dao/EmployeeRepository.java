package com.Crud.RestfullCrud.dao;

import com.Crud.RestfullCrud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository  extends JpaRepository<Employee,Integer> {
}
