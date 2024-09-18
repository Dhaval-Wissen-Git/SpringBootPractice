package com.wissen.springboot.practice.rest;

import com.wissen.springboot.practice.model.Professor;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/professor")
public class ProfessorController {

    EntityManager entityManager;

    @GetMapping("/v1/getAll")
    public List<Professor> getAllProfessors() {
        return entityManager.createQuery("from Professor", Professor.class).getResultList();
    }

    @PostMapping("/v1/save")
    public void save(Professor professor) {
        entityManager.persist(professor);
    }
}
