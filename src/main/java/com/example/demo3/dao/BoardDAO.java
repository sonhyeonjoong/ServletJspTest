package com.example.demo3.dao;

import com.example.demo3.vo.ArticleVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class BoardDAO {
    private Connection conn;
    private BoardDAO() {
    }
    public static class LazyHolder {
        // create only one DAO object
        private  static final BoardDAO INSTANCE = new BoardDAO();
    }
    public static BoardDAO getInstance() {
        return LazyHolder.INSTANCE;
    }
    public void setConnection(Connection conn) {
        this.conn = conn;
    }
    // get data from DB and save in VO, return Arraylist
    public ArrayList<ArticleVO> getArticleList() {
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<ArticleVO> list = new ArrayList<ArticleVO>();
        String NowDate = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date());

        try {
            pstmt = conn.prepareStatement("SELECT * FROM BOARD");
            rs = pstmt.executeQuery();
            while (rs.next()) {
                ArticleVO vo = new ArticleVO();
                vo.setBId(rs.getInt(1));
                vo.setId(rs.getInt(2));
                vo.setSubject(rs.getString(3));
                vo.setContent(rs.getString(4));
                vo.setHit(rs.getInt(5));
                vo.setWDate(rs.getString(6));
                list.add(vo);
            }
            rs.close();
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public int insertArticle(String id, String BoardWriteTitle, String bdContent) {
        String insertSQL = "INSERT INTO BOARD (ID, SUBJECT, CONTENT) " +
                "VALUES ((SELECT ID FROM MEMBER WHERE MB_ID=?), ?, ?)";
        int re = -1;
        try {
            PreparedStatement pstmt = conn.prepareStatement(insertSQL);
            pstmt.setString(1, id);
            pstmt.setString(2, BoardWriteTitle);
            pstmt.setString(3, bdContent);
            pstmt.executeUpdate();
            re = 1;

            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (re == -1) {
            System.out.println("Article data insert fail!");
        }
        return re;
    }
}
