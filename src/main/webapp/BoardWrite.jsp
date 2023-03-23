<%--
  Created by IntelliJ IDEA.
  User: KDN User
  Date: 2023-02-20
  Time: AM 9:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import= "com.example.demo3.vo.GeneralVO"%>
<%@ page import= "java.util.ArrayList"%>
<%
    ArrayList<GeneralVO> list = (ArrayList<GeneralVO>) request.getAttribute("list");
%>
<html>
<head>
    <title>BoardWrite</title>
    <script src="https://code.jquery.com/jquery-1.11.3.js" type="text/javascript"></script>
    <link href="./bootstrap/bootstrap.css" rel="stylesheet">
    <link href="CSS/BoardWrite.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-xl-12 col-md-12">
            <div class="card">
                <div class="card-body">
                    <form name="bdw_frm" action="BoardWriteAction.jsp" method="post">
                        <label>게시글작성</label>
                        <input type="text" rows="10" class = "form-control mt-0 mb-2" name="BoardWriteTitle" placeholder="제목을 입력해주세요" required />
                        <div class="form-group">
                            <textarea type="text" class="form-control" rows="10" name="bdContent" placeholder="내용을 입력해주세요" required></textarea>
                        </div>
                        <div>
                            <button type="button" class="btn btn-secondary md-3" onclick="inputCheck()">제출하기</button>
                            <button type="button" class="btn btn-secondary md-3" onclick="location.href='BoardHome.do'">취소</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

<script>
    function inputCheck(){
        if(document.getElementsByTagName('input').item(0).value == ""){
            alert("제목을 입력해주세요.");
            document.getElementsByName('BoardWriteTitle')[0].focus();
        } else {
            if(document.getElementsByTagName('textarea').item(0).value == ""){
                alert("내용을 입력해주세요.");
                document.getElementsByName('bdContent')[0].focus();
            } else {
                document.bdw_frm.submit();
            }
        }
    }
</script>

<link href="./bootstrap/bootstrap.js" rel="stylesheet">
</body>
</html>
