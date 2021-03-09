package com.example.universitydepartentsservice.service.impl;

import com.example.universitydepartentsservice.dto.DepartmentStatistic;
import com.example.universitydepartentsservice.model.Professor;
import com.example.universitydepartentsservice.repository.DepartmentRepository;
import com.example.universitydepartentsservice.service.DepartmentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Double getAverageSalary(String departmentName) {
        return departmentRepository
                .getByDepartmentName(departmentName)
                .getProfessors()
                .stream()
                .mapToInt(Professor::getSalary)
                .summaryStatistics()
                .getAverage();
    }

    @Override
    public Integer getNumberOfProfessorsInDepartment(String departmentName) {
        return departmentRepository
                .getByDepartmentName(departmentName)
                .getProfessors()
                .size();
    }

    @Override
    public Professor getHead(String departmentName) {
        return departmentRepository
                .getByDepartmentName(departmentName)
                .getHeadOfDepartment();
    }

    @Override
    public List<DepartmentStatistic> getDepartmentStatistic(String departmentName) {
        return departmentRepository.getStatistic(departmentName);
    }
}
