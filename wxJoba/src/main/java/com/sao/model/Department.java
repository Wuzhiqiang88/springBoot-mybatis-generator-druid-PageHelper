package com.sao.model;

public class Department {
    private Integer id;

    private String department1Name;

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
}