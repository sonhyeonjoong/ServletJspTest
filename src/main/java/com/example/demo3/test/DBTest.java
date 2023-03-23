/*
package com.example.demo3.test;

import java.sql.*;

public class DBTest {

    public static void main(String[] args){

        DBTest test = new DBTest();
        DBTest.DBwrite();

    }
    public static void DBwrite(){
        final String DB_URL = "jdbc:oracle:thin:@localhost:1521:ORCLDB";
        final String USER = "EXEDI";
        final String PASS = "exedi";

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM TEST";
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                // Retrieve by column name
                int id = rs.getInt("ID");
                String name = rs.getString("NAME");

                //Display Values
                System.out.println("ID: " + id + ", Name: " + name + "<br>");
            }
            rs.close();
            try {
                stmt.close();
            } catch(SQLException se) {
                se.printStackTrace();
            }
            try {
                conn.close();
            }  catch(SQLException se2) {
                se2.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
*/