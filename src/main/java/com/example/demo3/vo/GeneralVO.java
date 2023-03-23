package com.example.demo3.vo;

public class GeneralVO {
    // Article VO
    private int bId;
    private int id;
    private String subject;
    private  String content;
    private  int hit;
    private String wDate;
    private String uDate;
    private String dDate;

    // MemberVO

    private String mbPWCheck;
    private String mbId;
    private String mbNickname;
    private String mbPw;
    private String mbName;
    private String mbEmail;
    private String mbGender;
    private boolean loginSt;
    private boolean leaveSt;

    // ArticleVO
    public int getBId() {
        return bId;
    }
    public void setBId(int bId) {
        this.bId = bId;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public int getHit() {
        return hit;
    }
    public void setHit(int hit) {
        this.hit = hit;
    }
    public String getWDate() {
        return wDate;
    }
    public void setWDate(String wDate) {
        this.wDate = wDate;
    }
    public String getUDate() {
        return uDate;
    }
    public void setUDate(String uDate) {
        this.uDate = uDate;
    }
    public String getDDate() {
        return dDate;
    }
    public void setDDate(String dDate) {
        this.dDate = dDate;
    }

    // MemberVO

    public String getmbPWCheck() {
        return mbPWCheck;
    }
    public void setmbPWCheck(String mbPWCheck) {
        this.mbPWCheck = mbPWCheck;
    }
    public String getMbId(){
        return mbId;
    }
    public void setMbId(String mbId){
        this.mbId = mbId;
    }
    public String getMbNickname(){
        return mbNickname;
    }
    public void setMbNickname(String mbNickname){
        this.mbNickname = mbNickname;
    }
    public String getMbPw(){
        return mbPw;
    }
    public void setMbPw(String mbPw){
        this.mbPw = mbPw;
    }public String getMbName(){
        return mbName;
    }
    public void setMbName(String mbName){
        this.mbName = mbName;
    }public String getMbEmail(){
        return mbEmail;
    }
    public void setMbEmail(String mbEmail){
        this.mbEmail = mbEmail;
    }public String getMbGender(){
        return mbGender;
    }
    public void setMbGender(String mbGender){
        this.mbGender = mbGender;
    }
    public boolean getLoginSt(){
        return loginSt;
    }
    public void setLoginSt(boolean loginSt){
        this.loginSt = loginSt;
    }
    public boolean getLeaveSt(){
        return leaveSt;
    }
    public void setLeaveSt(boolean leaveSt){
        this.leaveSt = leaveSt;
    }
}
