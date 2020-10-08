package io.jpatest.demo.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import io.jpatest.demo.model.Employee;

@RunWith(SpringRunner.class)
@DataJpaTest
public class EmployeeRepositoryTest {

	 @Autowired
	 private EmployeeRepository employeeRepository;

	    @Test
	    public void testSaveEmployee() {

	        Employee employee = new Employee("admin", "admin", "admin@gmail.com");
	        employeeRepository.save(employee);
			System.out.println(employee);
			Assert.notNull(employee.getId());
			Assert.state(employee.getFirstName().equals("admin"));
	    }
			
	    @Test
	    public void deletByEmployeeIdTest() {
	        Employee employee = new Employee("admin", "admin", "admin@gmail.com");
	        Employee emp = employeeRepository.save(employee);
	        employeeRepository.deleteById(emp.getId());
	    }

	    @Test
	    public void testGetEmployee() {
	    	System.out.println("********************** "+employeeRepository.findAll());
	    	Employee employee2 = employeeRepository.findByemailId("howtodoinjava@gmail.com");
	    	Assert.notNull(employee2);
	    }
}
