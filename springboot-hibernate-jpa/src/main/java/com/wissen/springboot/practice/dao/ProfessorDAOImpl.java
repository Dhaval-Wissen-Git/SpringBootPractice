package com.wissen.springboot.practice.dao;

import com.wissen.springboot.assistants.Coach;
import com.wissen.springboot.practice.model.Professor;
import jakarta.persistence.EntityManager;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Repository
public class ProfessorDAOImpl implements ProfessorDAO {

    // Define field for Entity Manager
    private EntityManager entityManager;

    // Inject Entity Manager using Constructor Injection
    // We have used @AllArgsConstructor annotation to inject Entity Manager

    // Implement save method
    @Override
    @Transactional
    public void save(Professor professor) {
        entityManager.persist(professor);
    }
}
