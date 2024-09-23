package com.wissen.springboot.practice.service;

import com.wissen.springboot.practice.dao.ProfessorDAO;
import com.wissen.springboot.practice.model.Professor;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProfessorServiceImpl implements ProfessorService {

    private ProfessorDAO professorDAO;

    @Override
    public void create(Professor professor) {
        professorDAO.create(professor);
    }

    @Override
    public Professor findById(int id) {
        return professorDAO.findById(id);
    }

    @Override
    public List<Professor> findAll() {
        return List.of();
    }
}
