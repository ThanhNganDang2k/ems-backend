package net.javaguides.ems.service;


import net.javaguides.ems.dto.EmployeeDto;
import net.javaguides.ems.entity.Employee;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployee(Long id);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployee(Long id, EmployeeDto employeeDto);

    void delete(Long id);
}
