package com.example.demo3.dao;

import com.example.demo3.vo.ArticleVO;
import com.example.demo3.vo.GeneralVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class GeneralDAO {

    private Connection conn;
    private GeneralDAO() {
    }
    public static class LazyHolder {
        // create only one DAO object
        private  static final GeneralDAO INSTANCE = new GeneralDAO();
    }
    public static GeneralDAO getInstance() {
        return GeneralDAO.LazyHolder.INSTANCE;
    }
    public void setConnection(Connection conn) {
        this.conn = conn;
    }

    public ArrayList<GeneralVO> getJoinList() {
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<GeneralVO> list = new ArrayList<GeneralVO>();

        try {
            pstmt = conn.prepareStatement("SELECT A.B_ID, A.ID, A.SUBJECT, A.CONTENT, A.HIT, A.W_DATE, B.MB_ID FROM BOARD A, MEMBER B WHERE A.ID = B.ID");
            rs = pstmt.executeQuery();
            while (rs.next()) {
                GeneralVO vo = new GeneralVO();
                vo.setBId(rs.getInt(1));
                vo.setMbId(rs.getString(7));
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
}
