<%--
  Created by IntelliJ IDEA.
  User: KDN User
  Date: 2023-02-23
  Time: AM 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>글보기</title>
    <link href="./bootstrap/bootstrap.css" rel="stylesheet">
    <link href="CSS/BoardRead.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-lg-12">
            <div class="card">
                <div class="card-body border-bottom">
                    <div class="d-flex align-items-center font-weight-bold" style="font-size: 25px">제목</div>
                </div>
                <div class="card-body border-bottom min-vh-100">
                    <div class="d-flex align-items-center" style="font-size: 15px">내용</div>
                </div>
                <div class="card-body">
                    <div>
                        <button type="button" class="btn btn-secondary md-3" onclick="location.href='BoardHome.do'">나가기</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<link href="./bootstrap/bootstrap.js" rel="stylesheet">
</body>
</html>
