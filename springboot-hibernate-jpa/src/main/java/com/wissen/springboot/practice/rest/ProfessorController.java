package com.wissen.springboot.practice.rest;

import com.wissen.springboot.practice.dao.ProfessorDAO;
import com.wissen.springboot.practice.dao.ProfessorDAOImpl;
import com.wissen.springboot.practice.model.Professor;
import com.wissen.springboot.practice.service.ProfessorService;
import jakarta.persistence.EntityManager;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/professor")
public class ProfessorController {

    private ProfessorService professorService;

    @GetMapping("/v1/getAll")
    public List<Professor> getAllProfessors() {
        return professorService.findAll();
    }

    @GetMapping("/v1/getById")
    public Professor getProfessorById(@RequestParam("id") int id){
//        return entityManager.find(Professor.class, id);
        id +=1;
        return null;
    }

    @PostMapping("/v1/createTemp")
    public void createTemp(){
        Professor p = new Professor();
        p.setFirstName("Prof. John");
        p.setLastName("Doe");
        p.setDepartment("Computer Science");
        p.setEmail("Prof_XVWJk@example.com");

        professorService.create(p);
    }

    @PostMapping("/v1/save")
    public void save(@RequestBody() Professor professor){
//        entityManager.persist(professor);
    }

    @PostMapping("/v1/create")
    public void createProfessor(){
//        long count = entityManager.createQuery("select count(*) from Professor", Long.class).getSingleResult();

//        count += 1;
//        Professor p = new Professor();
//        p.setFirstName("John_" + count);
//        p.setLastName("Doe");
//        p.setEmail("XVWJk_" + count + "@example.com");
//        entityManager.persist(p);
    }
}

