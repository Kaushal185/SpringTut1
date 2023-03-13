package com.example.demo;

public class Doctor implements Science {
    private String qualification;
    public void assist(){
        System.out.println("assisting");
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
