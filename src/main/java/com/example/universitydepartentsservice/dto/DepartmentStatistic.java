package com.example.universitydepartentsservice.dto;

import com.example.universitydepartentsservice.model.Professor;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DepartmentStatistic {
    private Professor.Degree degree;
    private Long amount;
}
