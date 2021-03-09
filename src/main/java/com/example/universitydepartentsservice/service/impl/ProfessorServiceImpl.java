package com.example.universitydepartentsservice.service.impl;

import com.example.universitydepartentsservice.model.Professor;
import com.example.universitydepartentsservice.repository.ProfessorRepository;
import com.example.universitydepartentsservice.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorServiceImpl implements ProfessorService {
    private final ProfessorRepository professorRepository;

    @Autowired
    public ProfessorServiceImpl(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    @Override
    public Professor findProfessorByStringValue(String value) {
        return professorRepository.findProfessorByStringValue(value).get();
    }
}
