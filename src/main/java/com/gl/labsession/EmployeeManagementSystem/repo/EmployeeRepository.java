package com.gl.labsession.EmployeeManagementSystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.labsession.EmployeeManagementSystem.entity.Employee;

@Repository

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
