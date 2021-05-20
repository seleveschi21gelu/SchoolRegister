package org.example.controller;

import org.example.entity.Professor;
import org.example.entity.Student;
import org.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentRestController {

    @Autowired
    private StudentService studentService;


    @GetMapping
    private List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping
    private Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @GetMapping("/{id}")
    private Student getStudentById(@PathVariable Integer id) {
        return studentService.getAllStudentsById(id);
    }

    @PutMapping("/{id}")
    private Student updateStudentById(@PathVariable Integer id, @RequestBody Student student) {
        student.setId(id);
        return studentService.updateStudentById(student);

    }

    @DeleteMapping("/{id}")
    private void deleteStudentById(@PathVariable Integer id) {
        studentService.deleteStudentById(id);
    }

    @PatchMapping("/{id}")
    private Student updateByPatchMapping(@PathVariable int id, @RequestBody Student student) {
        student.setId(id);
        return studentService.updateStudentById(student);
    }



}
