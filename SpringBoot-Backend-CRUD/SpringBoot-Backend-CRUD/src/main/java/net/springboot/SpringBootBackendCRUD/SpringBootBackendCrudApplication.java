package net.springboot.SpringBootBackendCRUD;

import net.springboot.SpringBootBackendCRUD.model.Employee;
import net.springboot.SpringBootBackendCRUD.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBackendCrudApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackendCrudApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
	/*	Employee employee = new Employee();
		employee.setFirstName("Ramesh");
		employee.setLastName("Kumar");
		employee.setEmailId("RameshKumar@gmail.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("John");
		employee1.setLastName("Paruto");
		employee1.setEmailId("JohnParuto@gmail.com");
		employeeRepository.save(employee1);
	 */
	}
}
