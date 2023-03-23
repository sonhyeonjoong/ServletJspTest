package com.example.demo3.common;

import com.example.demo3.exception.NullCloseException;
import com.example.demo3.exception.NullCommitException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcUtil {
    public static Connection getConnection() {
        Connection conn = null;
        //JDBC driver name and database URL
        final String JDBC_DRIVER = "oracle.jdbc.OracleDriver";
        final String DB_URL = "jdbc:oracle:thin:@localhost:1521:ORCLDB";
        // Database credentials
        final String USER = "EXEDI";
        final String PASS = "exedi";
        try {
            // Register JDBC Driver
            Class.forName(JDBC_DRIVER);
            // Open connection
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void close(Connection conn){
        try {
            NullCloseCheck(conn);
            conn.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void close(PreparedStatement pstmt){
        try {
            NullCloseCheck(pstmt);
            pstmt.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void close(ResultSet rs){
        try {
            NullCloseCheck(rs);
            rs.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void commit(Connection conn){
        try {
            NullCommitCheck(conn);
            conn.commit();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void rollback(Connection conn){
        try {
            conn.commit();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    // check null when close or commit something
    public static void NullCloseCheck(Connection conn) throws NullCloseException {
        if(conn == null) {
            throw new NullCloseException("Connection is null");
        }
    }
    public static void NullCloseCheck(PreparedStatement pstmt) throws NullCloseException {
        if(pstmt == null) {
            throw new NullCloseException("PreparedStatement is null");
        }
    }
    public static void NullCloseCheck(ResultSet rs) throws NullCloseException {
        if(rs == null) {
            throw new NullCloseException("ResultSet is null");
        }
    }
    public static void NullCommitCheck(Connection conn) throws NullCommitException {
        if(conn == null) {
            throw new NullCommitException("Commit Object is null");
        }
    }
}
