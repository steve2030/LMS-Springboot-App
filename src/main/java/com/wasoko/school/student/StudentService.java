package com.wasoko.school.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public Student saveStudent(Student student){
        return studentRepository.save(student);

    }
    public List<Student>getAllStudents(){
        return studentRepository.findAll();

    }
    public Student getStudentById(Long id){
        return studentRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Student Not Found"));

    }
    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }
}
