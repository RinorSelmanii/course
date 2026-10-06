package com.example.course;

import java.util.Objects;

//The class that we need to store subjects.
public class subject {

    private int id;
    private String name;
    private String professor;
    private int credits;

    public subject(){

    }

    public subject(int id ,String name, String professor, int credits){
        this.id = id;
        this.name = name;
        this.professor = professor;
        this.credits = credits;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getProffesor(){
        return professor;
    }
    public int getCredits(){
        return credits;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setProffesor(String professor){
        this.professor = professor;
    }
    public void setCredits(int credits){
        this.credits = credits;
    }

        public boolean equals(Object obj){
            
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        subject subject = (subject) obj;
        return this.id == subject.id && Objects.equals(this.name, subject.name);
        }
}
