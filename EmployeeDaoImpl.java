package mvc;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

import beans.Employee;
@Repository
public class EmployeeDaoImpl {
public List<Employee> getEmpls(){
	List<Employee> emplist=new ArrayList<Employee>();
	emplist.add(new Employee(111,"qwert",2456));
	emplist.add(new Employee(113,"qwerty",2456));
	emplist.add(new Employee(114,"qwert",2456));
	return emplist;
	
}
}
