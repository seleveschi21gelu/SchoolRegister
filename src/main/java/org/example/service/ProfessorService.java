package org.example.service;

import org.example.entity.Professor;
import org.example.entity.Register;
import org.example.entity.Student;
import org.example.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    public List<Professor> getProfessorList() {
        return professorRepository.findAll();
    }

    public Professor addProfessor(Professor professor) {
        return professorRepository.save(professor);
    }

    public Professor getProfessorById(int id) {
        return professorRepository.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public Professor updateProfessorById(Professor professor) {
        return professorRepository.save(professor);
    }

    public void deleteProfessorById(int id) {
        professorRepository.deleteById(id);
    }



}
