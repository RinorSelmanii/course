package com.example.course; 

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service 
public class StudentService {

    private StudentRepository StudentRepository;

        public StudentService(StudentRepository StudentRepository){
            this.StudentRepository = StudentRepository;
        }

        public List<Student> getStudents(){
            return StudentRepository.findAll();
        }

        public Student insertStudent(@RequestBody Student student){

            return StudentRepository.save(student);

        }
        
    
} 
    
