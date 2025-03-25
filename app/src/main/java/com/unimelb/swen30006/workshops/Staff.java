package com.unimelb.swen30006.workshops;

import java.util.ArrayList;
import java.util.Date;

public class Staff extends Person {
    String[] roles;
    String[] staffID;
    ArrayList<Subject> subjects;

    public Staff(String[] address, Date dob, String[] name, String[] roles, String[] staffID) {
        this.address = address;
        this.dob = dob;
        this.name = name;
        this.roles = roles;
        this.staffID = staffID;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(Subject subject){
        subjects.add(subject);
    }

    public void removeSubject(Subject subject){
        subjects.remove(subject);
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    public String[] getStaffID() {
        return staffID;
    }

    public void setStaffID(String[] staffID) {
        this.staffID = staffID;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }
}
