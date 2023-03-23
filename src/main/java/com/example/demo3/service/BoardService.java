package com.example.demo3.service;

import com.example.demo3.dao.BoardDAO;
import com.example.demo3.dao.GeneralDAO;
import com.example.demo3.dao.MemberDAO;
import com.example.demo3.vo.ArticleVO;
import com.example.demo3.vo.GeneralVO;
import com.example.demo3.vo.MemberVO;

import static com.example.demo3.common.JdbcUtil.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

public class BoardService {
    // get DB list from DAO and return list
    public ArrayList<ArticleVO> getArticleList(){
        BoardDAO dao = BoardDAO.getInstance();
        // connect to Oracle DB using getConnection method of JdbcUtil class
        Connection conn = getConnection();
        // deliver connected connection object to DAO
        dao.setConnection(conn);
        // get DB list from DAO
        ArrayList<ArticleVO> list = dao.getArticleList();
        try {
            conn.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
    public ArrayList<GeneralVO> getJoinList(){
        GeneralDAO dao = GeneralDAO.getInstance();
        // connect to Oracle DB using getConnection method of JdbcUtil class
        Connection conn = getConnection();
        // deliver connected connection object to DAO
        dao.setConnection(conn);
        // get DB list from DAO
        ArrayList<GeneralVO> list = dao.getJoinList();
        try {
            conn.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
    public int insertMember(String id, String nickname, String pw, String name, String email){
        int re = -1;

        try{
            MemberDAO dao = MemberDAO.getInstance();
            Connection conn = getConnection();
            dao.setConnection(conn);
            re = dao.insertMember(id, nickname, pw, name, email);
            conn.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return re;
    }

}
