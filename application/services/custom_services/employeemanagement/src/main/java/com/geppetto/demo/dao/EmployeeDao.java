package com.geppetto.demo.dao;

import com.geppetto.demo.model.Employee;
import java.util.List;
import java.util.Optional;


public interface EmployeeDao {

    Employee create(Employee employee);


    Optional<Employee> getEntityById(String id);


    List<Employee> getAllValues();


    Optional<Employee> update(String id);


    void delete(String id);

}
