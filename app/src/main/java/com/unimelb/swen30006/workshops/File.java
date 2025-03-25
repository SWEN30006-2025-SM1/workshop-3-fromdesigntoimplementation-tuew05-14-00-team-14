package com.unimelb.swen30006.workshops;

import java.util.Date;

public class File {
    private Date createdDate;
    private String fileData;
    private String fileName;

    public File(String fileName, String fileData, Date createdDate) {
        this.fileName = fileName;
        this.fileData = fileData;
        this.createdDate = createdDate;
    }

    public File() {

    }

    public String content() {
        return fileData;
    }

    public int fileSize() {
        return fileData.length();
    }

    public String fileType(){
        double num = Math.random();
        if(num<0.5){
            return "pdf";
        } else {
            return "docx";
        }
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getFileData() {
        return fileData;
    }

    public void setFileData(String fileData) {
        this.fileData = fileData;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}