/*
package com.example.demo3.test;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "testServlet", value = "/Test")
public class DBConnTest extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException  {

        //JDBC driver name and database URL
        final String JDBC_DRIVER = "oracle.jdbc.OracleDrive";
        final String DB_URL = "jdbc:oracle:thin:@localhost:1521:ORCLDB";

        // Database credentials
        final String USER = "EXEDI";
        final String PASS = "exedi";

        // Set response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String title = "Database Result";

        String docType =
                "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor = \"#f0f0f0\">\n" +
                "<h1 align = \"center\">" + title + "</h1>\n");
        try {
            // Register JDBC Driver
            Class.forName("oracle.jdbc.OracleDriver");

            // Open a connection
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Execute SQL query
            Statement stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM TEST";
            ResultSet rs = stmt.executeQuery(sql);

            // Extract data from result set
            while(rs.next()){
                // Retrieve by column name
                int id = rs.getInt("ID");
                String name = rs.getString("NAME");

                //Display Values
                out.println("ID: " + id + "<br>");
                out.println("NAME: " + name + "<br>");
            }
            out.println("</body></html>");

            // Clean-up environment
            rs.close();
            try {
                stmt.close();
            } catch(SQLException se2) {
                se2.printStackTrace();
            }
            try {
                conn.close();
            }  catch(SQLException se) {
                se.printStackTrace();
            }
        } catch(SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } catch(Exception e) {
            // Handle errors for Class.forName
            e.printStackTrace();
        } //end try
    }

}
*/
