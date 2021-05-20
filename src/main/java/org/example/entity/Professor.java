package org.example.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String subjectMatter;
    private int age;
    private String email;

    public Professor(String name, String subjectMatter, int age, String email) {
        this.name = name;
        this.subjectMatter = subjectMatter;
        this.age = age;
        this.email = email;
    }

    public Professor(int id) {
        this.id = id;
    }

    public Professor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubjectMatter() {
        return subjectMatter;
    }

    public void setSubjectMatter(String subjectMatter) {
        this.subjectMatter = subjectMatter;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
