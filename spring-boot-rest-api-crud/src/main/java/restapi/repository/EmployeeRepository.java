package restapi.repository;
import org.springframework.data.repository.CrudRepository;

import restapi.model.Employee;
public interface EmployeeRepository extends CrudRepository<Employee,Long>{

}
