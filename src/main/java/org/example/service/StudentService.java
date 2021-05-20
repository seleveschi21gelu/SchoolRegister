package org.example.service;

import org.example.entity.Student;
import org.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Daniel", "C++", LocalDate.of(2021, 5, 30), "Programming", 2));
        studentList.add(new Student("Andrada", "Java", LocalDate.of(2021, 8, 23), "Electronic", 1));
        studentList.add(new Student("Antonia", "Phyton", LocalDate.of(2021, 7, 15), "Software", 3));

        studentRepository.saveAll(studentList);
        return studentRepository.findAll();

    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);

    }

    public Student getAllStudentsById(Integer id) {
        return studentRepository.findById(id).orElseThrow(() -> new RuntimeException("The student from id: " + id + " was not found"));
    }

    public Student updateStudentById(Student student) {
        return studentRepository.save(student);

    }

    public void deleteStudentById(Integer id) {
        studentRepository.deleteById(id);
    }



}
