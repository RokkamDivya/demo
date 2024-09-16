package com.example.College;

import org.springframework.stereotype.Component;

@Component
/*public class Faculty implements Collage {

    private String name;
    private String department;

    public Faculty() {
        this.name = "Dr. Debendra Maharana";
        this.department = "Computer Science Engineering";
    }

    @Override
    public void Clginfo() {
        System.out.println("Faculty Name: " + name + ", Department: " + department);
    }
}*/

public class Faculty implements Collage {
    
    public void Clginfo() {
        System.out.println("I am your Guide - Faculty");
    }
}