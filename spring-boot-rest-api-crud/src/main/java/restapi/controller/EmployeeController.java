package restapi.controller;

import java.awt.print.Book;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import restapi.model.Employee;
import restapi.repository.EmployeeRepository;
import restapi.service.EmployeeService;

@RestController
@EnableAutoConfiguration
@RequestMapping(value="/api")
public class EmployeeController {
@Autowired
EmployeeService service;
//Create a new Note
@PostMapping("/addsave")
public Employee createNote(@Valid @RequestBody Employee employee) {
    return service.save(employee);
}
public Employee save(@RequestBody Employee employee)
{

	service.save(employee);
	return employee;
}
@GetMapping("/list")
public List<Employee> list(){
	return service.getAllEmployees();
	
}

@GetMapping("/list/{id}")
public Employee getById(@PathVariable Long id)
{
	return service.getById(id);
}
@DeleteMapping("/delete/{id}")
public String deleteEmployee(@PathVariable(value="id")Long id)
{
	 service.deleteEmployee(id);
	return "deleted successfully id ="+id;
}
}
