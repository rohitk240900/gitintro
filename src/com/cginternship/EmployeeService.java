package com.cginternship;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class EmployeeService {
	List<Employee> list = EmployeeRepository.getEmployees();
	public Employee getEmployee(int id, String name) {
		//display the Employee details based on id or name
		
		Employee emp=list.stream().filter(e->e.getId()==id||e.getName().equals(name)).collect(Collectors.toList()).get(0);
		return emp;
	}
	public List<Employee> getEmployees(Double salary) {
		// display the details of employees who are getting the salary greater than the
		// salary given
		List<Employee> l=list.stream().filter(e->e.getSalary()>salary).collect(Collectors.toList());
		return l;
	}
	public Double getMaxSalary() {
		// display the max salary
		return null;
	}
	public Double getSumOfSalary() {
		// display the sum of salaries of all the employees
		return null;
	}

	public List<String> getNames(String city) {
		// display the names of all employees who are working in 'Pune'
		List<Employee> l=list.stream().filter(e->e.getLocation().equals(city)).collect(Collectors.toList());
		List<String> l1=Stream.of(l.stream().filter(e->e.getName()).collect(Collectors.toList())); 
	}
	public List<Employee> getDetails() {
		// display all employees based on salary ascending
		return null;
	}
	public List<Employee> getManagers() {
		// display all employees who are working as managers
		return null;
	}
	public Double getSumOfManagerSalaries() {
		// display the sum of salaries of employees who are working as managers
		return null;
	}
	public List<String> getIds() {
		// display the ids of all employees
		return null;
	}
	public List<String> getManagerNames(){
	//display names of employees who are managers
		return null;	
	}
	
}
