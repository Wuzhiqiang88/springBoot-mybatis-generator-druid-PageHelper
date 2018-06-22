package com.sao.model;

public class Symptoms {
    private Integer id;

    private String department2Name;

    private String symptomsName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartment2Name() {
        return department2Name;
    }

    public void setDepartment2Name(String department2Name) {
        this.department2Name = department2Name == null ? null : department2Name.trim();
    }

    public String getSymptomsName() {
        return symptomsName;
    }

    public void setSymptomsName(String symptomsName) {
        this.symptomsName = symptomsName == null ? null : symptomsName.trim();
    }
}