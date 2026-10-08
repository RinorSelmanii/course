package com.example.course;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
 
    @DeleteMapping("{id}") 
    public String deleteSubject(@PathVariable Integer id){
        subjectService.deleteSubject(id);
        return "Deleted subject with id: " + id;
    }

    @PutMapping ("/{id}/professor")
    public subject updateProfessor(@PathVariable Integer id, @RequestParam String professor){

        return subjectService.updateProfessor(id,professor);

    }
    
        

}
