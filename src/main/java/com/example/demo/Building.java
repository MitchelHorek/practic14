package com.example.demo;

public class Building {
    private String creationDate;
    private TypeBuild type;

    public Building(String creationDate, TypeBuild type) {
        this.creationDate = creationDate;
        this.type = type;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public TypeBuild getType() {
        return type;
    }

    public void setType(TypeBuild type) {
        this.type = type;
    }
}

