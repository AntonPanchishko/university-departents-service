package com.example.universitydepartentsservice.repository;

import com.example.universitydepartentsservice.dto.DepartmentStatistic;
import com.example.universitydepartentsservice.model.Department;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Department getByDepartmentName(String departmentName);

    @Query("SELECT new com.example.universitydepartentsservice"
            + ".dto.DepartmentStatistic(p.degree, COUNT(p)) "
            + "FROM departments d "
            + "JOIN FETCH  professors p "
            + "WHERE d.departmentName = :departmentName "
            + "GROUP BY d, p.degree")
    List<DepartmentStatistic> getStatistic(String departmentName);
}
