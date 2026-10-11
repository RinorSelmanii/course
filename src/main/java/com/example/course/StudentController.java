package com.example.course;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController 
@RequestMapping ("api/students")
public class StudentController {

    private StudentService StudentService;

        public StudentController(StudentService StudentService){
            this.StudentService = StudentService;
        }

        @GetMapping 
        public List<Student> getStudents(){
            return StudentService.getStudents();
        }

        @PostMapping 
        public Student addStudent(@RequestBody Student student){

            return StudentService.insertStudent(student);

        }

        @DeleteMapping ("{id}")
        public String deleteStudent(@PathVariable Integer id){
            StudentService.deleteStudent(id);
            return "Deleted Student with id " + id;
        }
    
}
