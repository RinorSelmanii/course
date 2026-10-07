package com.example.course;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

//The class that we need to store subjects.
@Entity 
public class subject {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer id;

     @Column(name = "name")
     private String name;

     @Column(name = "professor")
     private String professor;

     @Column(name = "credits")
     private Integer credits;

    public subject(){

    }
  
    public subject(Integer id ,String name, String professor, Integer credits){
        this.id = id;
        this.name = name;
        this.professor = professor;
        this.credits = credits;
    }

     
    public Integer getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getProfessor(){
        return this.professor;
    }
    public Integer getCredits(){
        return this.credits;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setProfessor(String professor){
        this.professor = professor;
    }
    public void setCredits(Integer credits){
        this.credits = credits;
    }

        
}
