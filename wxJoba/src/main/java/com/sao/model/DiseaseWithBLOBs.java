package com.sao.model;

public class DiseaseWithBLOBs extends Disease {
    private String introductionOfDisease;

    private String highIncidenceGroup;

    private String contagion;

    private String state;

    private String inspect;

    private String diagnosis;

    private String cure;

    private String nursing;

    public String getIntroductionOfDisease() {
        return introductionOfDisease;
    }

    public void setIntroductionOfDisease(String introductionOfDisease) {
        this.introductionOfDisease = introductionOfDisease == null ? null : introductionOfDisease.trim();
    }

    public String getHighIncidenceGroup() {
        return highIncidenceGroup;
    }

    public void setHighIncidenceGroup(String highIncidenceGroup) {
        this.highIncidenceGroup = highIncidenceGroup == null ? null : highIncidenceGroup.trim();
    }

    public String getContagion() {
        return contagion;
    }

    public void setContagion(String contagion) {
        this.contagion = contagion == null ? null : contagion.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getInspect() {
        return inspect;
    }

    public void setInspect(String inspect) {
        this.inspect = inspect == null ? null : inspect.trim();
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis == null ? null : diagnosis.trim();
    }

    public String getCure() {
        return cure;
    }

    public void setCure(String cure) {
        this.cure = cure == null ? null : cure.trim();
    }

    public String getNursing() {
        return nursing;
    }

    public void setNursing(String nursing) {
        this.nursing = nursing == null ? null : nursing.trim();
    }
}