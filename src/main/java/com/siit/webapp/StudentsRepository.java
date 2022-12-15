package com.siit.webapp;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class StudentsRepository {

    public List<Student> getStudents(){
        List<Student> studentList = new ArrayList<>();

        Student student1 = new Student("Mihai", "Pop");
        Student student2 = new Student("Roxana", "Dobre");
        Student student3 = new Student("Vali", "Topescu");
        Student student4 = new Student("Cosmin", "Dragan");
        Student student5 = new Student("George", "Iordache");
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        List<Integer> grades1 = Arrays.asList(3, 4, 6, 9, 10, 7, 8);
        List<Integer> grades2 = Arrays.asList(8, 8, 9, 10, 8, 4, 10);
        List<Integer> grades3 = Arrays.asList(7, 10, 9, 5, 7, 9, 10);
        List<Integer> grades4 = Arrays.asList(6, 7, 8, 4, 6, 10, 10);
        List<Integer> grades5 = Arrays.asList(10, 10, 10, 10, 10, 10, 10);
        student1.setGrades(grades1);
        student2.setGrades(grades2);
        student3.setGrades(grades3);
        student4.setGrades(grades4);
        student5.setGrades(grades5);

        return studentList;
    }
}