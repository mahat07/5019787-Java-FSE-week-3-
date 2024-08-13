package com.example.employeemanagementsystem.repository;

import com.example.employeemanagementsystem.model.Employee;
import com.example.employeemanagementsystem.projection.EmployeeProjection;
import com.example.employeemanagementsystem.projection.EmployeeSummary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("SELECT e.id AS id, e.name AS name FROM Employee e")
    List<EmployeeProjection> findEmployeeProjections();

    @Query("SELECT new com.example.employeemanagementsystem.projection.EmployeeSummary(e.id, e.name) FROM Employee e")
    List<EmployeeSummary> findEmployeeSummaries();
}
