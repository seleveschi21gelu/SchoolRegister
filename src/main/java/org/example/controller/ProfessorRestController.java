package org.example.controller;

import org.example.entity.Professor;
import org.example.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professor")
public class ProfessorRestController {

    @Autowired
    private ProfessorService professorService;

    @GetMapping
    private List<Professor> getAllProfessors() {
        return professorService.getProfessorList();

    }

    @GetMapping("/{id}")
    private Professor getProfessorById(@PathVariable int id) {
        return professorService.getProfessorById(id);
    }

    @PostMapping
    private Professor addProfessors(@RequestBody Professor professor) {
        return professorService.addProfessor(professor);
    }

    @PatchMapping("/{id}")
    private Professor updateProfessorById(@PathVariable int id, @RequestBody Professor professor) {
        professor.setId(id);
        return professorService.updateProfessorById(professor);
    }

    @DeleteMapping("/{id}")
    private void deleteProfessorById(@PathVariable int id) {
        professorService.deleteProfessorById(id);
        Professor professor = new Professor();
        System.out.println("The professor " + professor.getName() + " was removed");
    }

    @PutMapping("/{id}")
    private Professor updateByPuttMapping(@RequestBody Professor professor, @PathVariable int id) {
        professor.setId(id);
        return professorService.updateProfessorById(professor);
    }
}
