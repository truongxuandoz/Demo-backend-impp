package net.javaguide.demobackend.service.impl;

import lombok.AllArgsConstructor;
import net.javaguide.demobackend.dto.EmployeeDto;
import net.javaguide.demobackend.entity.Employee;
import net.javaguide.demobackend.exception.ResourceNotFoundException;
import net.javaguide.demobackend.mapper.EmployeeMapper;
import net.javaguide.demobackend.repository.EmployeeRepository;
import net.javaguide.demobackend.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceimpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.maptoEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId) .orElseThrow(() -> new ResourceNotFoundException("Employee is not exists with given id:" + employeeId));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }
}
