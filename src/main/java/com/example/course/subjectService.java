package com.example.course;
import java.util.List;

import javax.security.auth.Subject;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service 
public class subjectService {

    private subjectRepository subjectRepository;

    public subjectService(subjectRepository subjectRepository){
        this.subjectRepository = subjectRepository;
    }

    public List<subject> getSubjects(){
        return subjectRepository.findAll();
    }
    public subject insertSubject(@RequestBody subject subject){
        return subjectRepository.save(subject);
    }

    public void deleteSubject(Integer id){

        if(subjectRepository.existsById(id)){
            subjectRepository.deleteById(id);
        }

    }

    public subject updateProfessor(Integer id, String professor){

        subject subject = subjectRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Subject not found"));
        subject.setProfessor(professor);
        return subjectRepository.save(subject);


    }
    
}
