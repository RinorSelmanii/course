package com.example.course;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class DoubleController {

    private StudentService StudentService;
    private subjectService subjectService;


    public DoubleController(StudentService StudentService, subjectService subjectService){
        this.StudentService = StudentService;
        this.subjectService = subjectService;
        
    }

    @GetMapping ("/data")
    public Map <String, Object> getAll(){
       
        //Krijojm lista per objekte qe ruajn te dhena nga metodat 
        List<Student> student = StudentService.getStudents();
        List<subject> Subject = subjectService.getSubjects();

        //Krijojm nje Map
        Map<String , Object> rez = new HashMap<>();

        //Tregojm se ncilt Key ruhen listat.
        rez.put("student",student);
        rez.put("Subject", Subject);

        return rez;

        
    }

         
        



}
