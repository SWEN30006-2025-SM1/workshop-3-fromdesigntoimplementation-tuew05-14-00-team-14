package com.unimelb.swen30006.workshops;

import java.util.Date;

public class Student extends Person {
    String[] email;
    String[] studentID;

    public Student(String[] address, Date dob, String[] name, String[] email, String[] studentID) {
        this.address = address;
        this.dob = dob;
        this.name = name;
        this.studentID = studentID;
        this.email = email;
    }

    private float getTotalGrade(float totalgrade){
        return this.totalGrade = totalgrade;
    }

    private void sendEmailMsg(String email){

    }

}
