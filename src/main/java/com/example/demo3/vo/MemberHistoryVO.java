package com.example.demo3.vo;

public class MemberHistoryVO {
    private int id;
    private  int mbSq;
    private int evtType;
    private String dttm;
    private String name;
    private String email;
    private String gender;

    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getMbSq() {
        return mbSq;
    }
    public void setMbSq(int mbSq){
        this.mbSq = mbSq;
    }
    public int getEvtType() {
        return evtType;
    }
    public void setEvtType(int evtType){
        this.evtType = evtType;
    }
    public String getDttm() {
        return dttm;
    }
    public void setDttm(String dttm){
        this.dttm = dttm;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
}
