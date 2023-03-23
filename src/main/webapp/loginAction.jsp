<%--
  Created by IntelliJ IDEA.
  User: KDN User
  Date: 2023-02-22
  Time: AM 10:17
  To change this template use File | Settings | File Templates.
--%>
<%@page import="com.example.demo3.vo.MemberVO"%>
<%@page import="com.example.demo3.dao.MemberDAO"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="static com.example.demo3.common.JdbcUtil.getConnection" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<script src="https://code.jquery.com/jquery-1.11.3.js" type="text/javascript"></script>
<%
String id = request.getParameter("mbID");
String pw = request.getParameter("mbPW");
MemberDAO dao = MemberDAO.getInstance();
MemberVO mb = null;
Connection conn = getConnection();
dao.setConnection(conn);

int check = dao.memberCheck(id, pw);
mb = dao.getMatchedMember(id);
conn.close();

if(mb == null) {
%>
<script>
  alert("존재하지 않는 회원");
  history.go(-1);
</script>
<%
} else {
  String nickname = mb.getMbNickname();
  if(check == 1) {
    session.setAttribute("id", id);
    session.setAttribute("nickname", nickname);
    session.setAttribute("Member", "yes"); // 임의로 회원일 경우 yes값을 준다
    response.sendRedirect("BoardHome.do");
  } else if(check == 0) {
%>
<script>
  alert("비밀번호가 틀렸습니다.");
  history.go(-1);
</script>
<%
  }
}
%>
