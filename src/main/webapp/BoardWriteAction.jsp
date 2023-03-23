<%--
  Created by IntelliJ IDEA.
  User: KDN User
  Date: 2023-02-22
  Time: PM 3:48
  To change this template use File | Settings | File Templates.
--%>
<%@page import="com.example.demo3.vo.MemberVO"%>
<%@page import="com.example.demo3.dao.MemberDAO"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="static com.example.demo3.common.JdbcUtil.getConnection" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="com.example.demo3.dao.BoardDAO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<script src="https://code.jquery.com/jquery-1.11.3.js" type="text/javascript"></script>
<%
    String id = session.getAttribute("id").toString();
    String bwt = request.getParameter("BoardWriteTitle");
    String bdc = request.getParameter("bdContent");
    BoardDAO dao = BoardDAO.getInstance();
    Connection conn = getConnection();
    dao.setConnection(conn);

    int check = dao.insertArticle(id, bwt, bdc);

    conn.close();

    response.sendRedirect("BoardHome.do");
%>
