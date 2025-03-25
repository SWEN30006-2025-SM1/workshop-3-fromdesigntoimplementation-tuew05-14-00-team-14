package com.unimelb.swen30006.workshops;

public class Submission {
    private int attemptNum;
    private File[] files;
    private int numFiles;

    public Submission(int attemptNum, File[] files, int numFiles) {
        this.attemptNum = attemptNum;
        this.files = files;
        this.numFiles = numFiles;
    }

    public File[] includedFiles(){
        File[] files = new File[2];
        files[0] = new File();
        files[1] = new File();
        return files;
    }

    public int getAttemptNum() {
        return attemptNum;
    }

    public void setAttemptNum(int attemptNum) {
        this.attemptNum = attemptNum;
    }

    public int getNumFiles() {
        return numFiles;
    }

    public void setNumFiles(int numFiles) {
        this.numFiles = numFiles;
    }

    public File[] getFiles() {
        return files;
    }

    public void setFiles(File[] files) {
        this.files = files;
    }
}
