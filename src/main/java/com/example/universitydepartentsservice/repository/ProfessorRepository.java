package com.example.universitydepartentsservice.repository;

import com.example.universitydepartentsservice.model.Professor;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
    @Query("FROM professors p "
            + "WHERE p.name LIKE CONCAT('%', CONCAT(:value, '%')) "
            + "OR p.lastname LIKE CONCAT('%', CONCAT(:value, '%'))")
    Optional<Professor> findProfessorByStringValue(String value);
}
