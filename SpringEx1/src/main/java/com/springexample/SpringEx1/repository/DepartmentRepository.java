package com.springexample.SpringEx1.repository;

import com.springexample.SpringEx1.entity.Department;
import lombok.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department , Long> {

     public Department findByDepartmentName(String departmentName);
     public Department findByDepartmentNameIgnoreCase(String departmentName);
}
