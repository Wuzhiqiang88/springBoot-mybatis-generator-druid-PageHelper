package com.sao.model;

public class Doctor {
    private Integer id;

    private Integer userid;

    private String cell;

    private String title;

    private String speciality;

    private String department1;

    private Float evaluate;

    private String department2;

    private String hospital;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell == null ? null : cell.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality == null ? null : speciality.trim();
    }

    public String getDepartment1() {
        return department1;
    }

    public void setDepartment1(String department1) {
        this.department1 = department1 == null ? null : department1.trim();
    }

    public Float getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(Float evaluate) {
        this.evaluate = evaluate;
    }

    public String getDepartment2() {
        return department2;
    }

    public void setDepartment2(String department2) {
        this.department2 = department2 == null ? null : department2.trim();
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital == null ? null : hospital.trim();
    }
}