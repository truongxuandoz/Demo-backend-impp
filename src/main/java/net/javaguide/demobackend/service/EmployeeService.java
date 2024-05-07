package net.javaguide.demobackend.service;

import net.javaguide.demobackend.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);
}
