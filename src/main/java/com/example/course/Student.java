package com.example.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class Student {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

        public Student(){

        }

        public Student(Integer id, String name /*subject subject*/){
            this.id = id;
            this.name = name;
            //this.subject = subject;
        }

        public Integer getId(){
            return this.id;
        }
        public String getName(){
            return this.name;
        } 
      /*   public subject getSubject(){
            return this.subject;
        }*/

        public void setName(String name){
            this.name = name;
        }

}
