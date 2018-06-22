package com.sao.model;

public class Departments {
    private Integer id;

    private String department1Name;

    private String department2Name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartment1Name() {
        return department1Name;
    }

    public void setDepartment1Name(String department1Name) {
        this.department1Name = department1Name == null ? null : department1Name.trim();
    }

    public String getDepartment2Name() {
        return department2Name;
    }

    public void setDepartment2Name(String department2Name) {
        this.department2Name = department2Name == null ? null : department2Name.trim();
    }
}