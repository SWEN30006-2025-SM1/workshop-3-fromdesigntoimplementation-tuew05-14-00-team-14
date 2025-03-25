package com.unimelb.swen30006.workshops;

import java.util.ArrayList;
import java.util.Date;

public class Student extends Person {
    String[] email;
    String[] studentID;
    ArrayList<Submission> submissions;

    public Student(String[] address, Date dob, String[] name, String[] email, String[] studentID) {
        this.address = address;
        this.dob = dob;
        this.name = name;
        this.studentID = studentID;
        this.email = email;
        this.submissions = new ArrayList<>();
    }

    private float getTotalGrade(float totalgrade){
        return this.totalGrade = totalgrade;
    }

    private void sendEmailMsg(String email){

    }

    private void submitSubmission(Submission submission){
        this.submissions.add(submission);
    }

    public String[] getEmail() {
        return email;
    }

    public void setEmail(String[] email) {
        this.email = email;
    }

    public String[] getStudentID() {
        return studentID;
    }

    public void setStudentID(String[] studentID) {
        this.studentID = studentID;
    }

    public ArrayList<Submission> getSubmissions() {
        return submissions;
    }

    public void setSubmissions(ArrayList<Submission> submissions) {
        this.submissions = submissions;
    }
}
