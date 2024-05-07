package net.javaguide.demobackend.repository;

import net.javaguide.demobackend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
