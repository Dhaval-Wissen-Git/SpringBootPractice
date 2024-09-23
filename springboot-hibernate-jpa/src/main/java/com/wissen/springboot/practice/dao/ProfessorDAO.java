package com.wissen.springboot.practice.dao;

import com.wissen.springboot.assistants.Coach;
import com.wissen.springboot.practice.model.Professor;

import java.util.List;

public interface ProfessorDAO {

    List<Professor> findAll();

    void create(Professor professor);

    Professor findById(int id);
}
