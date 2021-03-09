package com.example.universitydepartentsservice.service;

import com.example.universitydepartentsservice.model.Professor;

public interface ProfessorService {
    Professor findProfessorByStringValue(String value);
}
