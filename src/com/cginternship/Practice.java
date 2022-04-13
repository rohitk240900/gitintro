package com.cginternship;
import java.util.List;
public class Practice {
		public static void main(String[] args) {
			EmployeeService service = new EmployeeService();
			service.getEmployee(156507,"pavan kumar").getDetails();
			service.getEmployees(76435.234).get(0).getDetails();
			System.out.println(service.getMaxSalary());
			System.out.println(service.getSumOfSalary());
			System.out.println(service.getNames("Pune"));
			System.out.println(service.getMaxSalary());
			List<Employee> el=service.getDetails();
			//for(Employee e:el)
			//	e.getDetails();
			List<Employee> l=service.getManagers();
			for(Employee e:l)
			//	e.getDetails();
			System.out.println(service.getMaxSalary());
			System.out.println(service.getSumOfManagerSalaries());
		}
}