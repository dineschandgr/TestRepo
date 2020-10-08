package io.jpatest.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.jpatest.demo.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	  Employee findByFirstName(String username);
	  Employee findByemailId(String username);
}
