package com.example.demo3.vo;

public class ArticleVO {
    // 글번호, 회원번호, 제목, 내용, 조회수, 작성일자, 수정일자, 삭제일자
    private int bId;
    private int id;
    private String subject;
    private  String content;
    private  int hit;
    private String wDate;
    private String uDate;
    private String dDate;

    // get & set
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
}
