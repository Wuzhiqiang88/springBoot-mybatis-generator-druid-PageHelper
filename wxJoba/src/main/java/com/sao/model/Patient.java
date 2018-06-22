package com.sao.model;

import java.util.Date;

public class Patient {
    private Integer id;

    private Integer userid;

    private String cell;

    private Byte gender;

    private Date birthday;

    private Double weight;

    private Byte allergy;

    private String allergichistory;

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

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Byte getAllergy() {
        return allergy;
    }

    public void setAllergy(Byte allergy) {
        this.allergy = allergy;
    }

    public String getAllergichistory() {
        return allergichistory;
    }

    public void setAllergichistory(String allergichistory) {
        this.allergichistory = allergichistory == null ? null : allergichistory.trim();
    }
}