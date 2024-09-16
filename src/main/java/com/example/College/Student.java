package com.example.College;

import org.springframework.stereotype.Component;

@Component
/*public class Student implements Collage {

    private String name;
    private String rollNumber;
    private String branch;

    public Student() {
        this.name = "Rokkam Divya";
        this.rollNumber = "220101120150";
        this.branch = "CSE";
    }

    @Override
    public void Clginfo() {
        System.out.println("Student Name: " + name + ", Roll Number: " + rollNumber + ", Branch: " + branch);
    }
}*/

public class Student implements Collage {
    @Override
    public void Clginfo() {
        System.out.println("I am Student");
    }
}