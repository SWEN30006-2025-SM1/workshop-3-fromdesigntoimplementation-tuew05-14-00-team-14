package com.unimelb.swen30006.workshops;

import java.util.Date;
import java.util.List;

public class Assignment {
    private String description;
    private Date dueDate;
    private int maxAttempts;
    private String name;
    private List<Submission> submissions;


    public List<Submission> invalidSubmissions() {
        List<Submission> invalidSubmissions = null;
        for (Submission submission : submissions) {
            if (!submission.isvalidate()) {
                invalidSubmissions.add(submission);
            }
        }
        return invalidSubmissions;
    }

    public List<Submission> validSubmissions() {
        List<Submission> validSubmissions = null;
        for (Submission submission : submissions) {
            if (submission.isvalidate()) {
                validSubmissions.add(submission);
            }
        }
        return validSubmissions;
    }
}

