package com.geppetto.demo.service;

import com.geppetto.demo.dto.EmployeeDto;
import java.util.List;
import java.util.Map;

public interface EmployeeService {

    EmployeeDto create(EmployeeDto employeeDto);


    EmployeeDto getEntityById(String id);


    List<EmployeeDto> getAllValues();


    EmployeeDto update(EmployeeDto employeeDto);


    String delete(String id);



}
