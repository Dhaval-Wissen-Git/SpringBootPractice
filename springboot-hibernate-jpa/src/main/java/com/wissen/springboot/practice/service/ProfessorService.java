package com.wissen.springboot.practice.service;

import com.wissen.springboot.practice.model.Professor;

import java.util.List;

public interface ProfessorService {

    Professor findById(int id);
    List<Professor> findAll();
    void create(Professor professor);
}
