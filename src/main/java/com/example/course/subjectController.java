package com.example.course;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping ("api/subjects")
public class subjectController {

    private subjectService subjectService;
    public subjectController(subjectService subjectService){
        this.subjectService = subjectService;
    }

    @GetMapping 
    public List<subject> getSubjects(){

        return subjectService.getSubjects();

    }

    @PostMapping 
    public subject addSubject(@RequestBody subject subject){
       return subjectService.insertSubject(subject);
    }
}
