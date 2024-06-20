package rw.ac.app.employeeservice.service;

import org.springframework.stereotype.Service;
import rw.ac.app.employeeservice.entity.Employee;

import java.util.List;

@Service
public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById();

    Employee getEmployeeById(Long id);

    Employee createEmployee(Employee employee);
    Employee updateEmployee(Long id, Employee employee);
    void deleteEmployee(Long id);
}
