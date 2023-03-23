package com.example.demo3.vo;

public class MemberVO {
    // 회원번호, 아이디, 비밀번호, 이름, 이메일, 성별, 로그인상태, 탈퇴상태

    private String mbPWCheck;
    private int id;
    private String mbId;
    private String mbNickname;
    private String mbPw;
    private String mbName;
    private String mbEmail;
    private String mbGender;
    private boolean loginSt;
    private boolean leaveSt;

    public String getmbPWCheck() {
        return mbPWCheck;
    }
    public void setmbPWCheck(String mbPWCheck) {
        this.mbPWCheck = mbPWCheck;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
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
