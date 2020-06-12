package restapi.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import restapi.service.EmployeeService;
import restapi.model.Employee;
import restapi.repository.EmployeeRepository;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
@Autowired
EmployeeRepository repository;
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return (List<Employee>)repository.findAll();
	}

	@Override
	public Employee getById(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public Employee save(Employee employee) {
		return repository.save(employee);
	}

	@Override
	public String deleteEmployee(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		return "deleted";
	}

}
