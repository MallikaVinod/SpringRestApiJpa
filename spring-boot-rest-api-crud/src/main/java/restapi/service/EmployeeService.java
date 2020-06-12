package restapi.service;
import java.util.List;

import restapi.model.Employee;
public interface EmployeeService {
public List<Employee> getAllEmployees();
public Employee getById(Long id);
public Employee save(Employee employee);
public String deleteEmployee(Long id);
}
