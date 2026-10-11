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

        //Metoda Delete
        public void deleteStudent(Integer id){
            if(StudentRepository.existsById(id)){
                StudentRepository.deleteById(id);
            }
        }

        //Metoda Update
        public Student updateStudent(Integer id , String name){

            Student Student = StudentRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Student not found"));
            
            Student.setName(name);
            return StudentRepository.save(Student);
            
        }
        
    
} 
    
