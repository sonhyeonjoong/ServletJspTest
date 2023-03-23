package com.example.demo3.dao;

import com.example.demo3.vo.ArticleVO;
import com.example.demo3.vo.MemberVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MemberDAO {
    private Connection conn;
    private MemberDAO() {
    }
    public static class LazyHolder {
        // create only one DAO object
        private  static final MemberDAO INSTANCE = new MemberDAO();
    }
    public static MemberDAO getInstance() {
        return LazyHolder.INSTANCE;
    }
    public void setConnection(Connection conn) {
        this.conn = conn;
    }
    // insert member data into DB from webpage form
    public int insertMember(String id, String nickname, String pw, String name, String email) throws Exception {
        String insertSQL = "insert into member (mb_id, mb_nickname, mb_pw, mb_name, mb_email) " +
                "values (?, ?, ?, ?, ?)";
        int re = -1;
        try {
            PreparedStatement pstmt = conn.prepareStatement(insertSQL);
            pstmt.setString(1, id);
            pstmt.setString(2, nickname);
            pstmt.setString(3, pw);
            pstmt.setString(4, name);
            pstmt.setString(5, email);
            pstmt.executeUpdate();
            re = 1;

            pstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return re;
    }
    // Login Check
    public int memberCheck(String id, String pw) throws Exception {
        int re = -1;
        String sql = "SELECT * FROM MEMBER WHERE MB_ID=?";

        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String dbMbPW = rs.getString(4);
                if (dbMbPW.equals(pw)) {
                    re = 1; // Allow login
                } else {
                    re = 0; // Not same password
                }
            }
            pstmt.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return re;
    }
    // Get matched member information
    public MemberVO getMatchedMember(String id) throws Exception {
        String sql = "SELECT * FROM MEMBER WHERE MB_ID=?";
        MemberVO member = null;
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();
            // Put matched member data into memberVO
            if (rs.next()) {
                member = new MemberVO();
                member.setMbId(rs.getString(2));
                member.setMbNickname(rs.getString(3));
                member.setMbPw(rs.getString(4));
                member.setMbName(rs.getString(5));
                member.setMbEmail(rs.getString(6));
            }
            pstmt.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return member;
    }

}
