package com.unimelb.swen30006.workshops;

import java.util.Date;

public class Staff extends Person {
    String[] roles;
    String[] Staffid;

    public Staff(String[] address, Date dob, String[] name, String[] roles, String[] Staffid) {
        this.address = address;
        this.dob = dob;
        this.name = name;
        this.Staffid = roles;
        this.roles = Staffid;
    }




}
