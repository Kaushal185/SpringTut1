package com.example.demo;

public class Engineer implements Science {
    private String qualification;
    public void assist(){
        System.out.println("developing");
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
