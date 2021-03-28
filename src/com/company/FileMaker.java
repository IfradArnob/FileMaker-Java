package com.company;
import java.time.LocalDateTime;

public class FileMaker {
    private static String fileId;
    private String name;
    private LocalDateTime fileCreated;
    private static int fileCounter;
    private String fileType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getFileCreated() {
        return fileCreated;
    }

    public void setFileCreated(LocalDateTime fileCreated) {
        this.fileCreated = fileCreated;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public FileMaker(String fileType) {
        if(FileTypeChecker(fileType) ) {
            this.fileId = IdCreator(fileType);
            this.fileType = fileType;
            this.fileCreated = LocalDateTime.now();

            System.out.println("File successfully created on " + this.fileCreated);
        }
        else {
            System.out.println("Please upload a valid file.");
        }
    }

    private static String IdCreator(String fileType) {
        return fileType + "_" + ++fileCounter;
    }

    private boolean FileTypeChecker(String fileType) {
        try {
            if (fileType == "txt" || fileType == "doc" || fileType == "py") {
                return true;
            }
            throw new Exception();
        } catch (Exception e) {
            return false;
        }
    }
    public void showInfo()
    {
        System.out.println(getName());
        System.out.println(getFileType());
        System.out.println(getFileCreated());
    }

}

