package com.example.universitydepartentsservice.service;

import com.example.universitydepartentsservice.dto.DepartmentStatistic;
import com.example.universitydepartentsservice.model.Professor;
import java.util.List;

public interface DepartmentService {
    Double getAverageSalary(String departmentName);

    Integer getNumberOfProfessorsInDepartment(String departmentName);

    Professor getHead(String departmentName);

    List<DepartmentStatistic> getDepartmentStatistic(String departmentName);
}
