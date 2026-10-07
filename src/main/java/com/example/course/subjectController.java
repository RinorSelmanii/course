package com.example.course;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping ("api/subjects")
public class subjectController {

    @GetMapping 
    public List<subject> getSubjects(){

        return List.of(
            new subject(1, "Math", "Albert", 6),
            new subject(2,"Algorithms","Angelina",5)    
        );

    }
}
