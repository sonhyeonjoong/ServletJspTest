<%--
  Created by IntelliJ IDEA.
  User: KDN User
  Date: 2023-02-20
  Time: AM 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>로그인</title>
  <script src="https://code.jquery.com/jquery-1.11.3.js" type="text/javascript"></script>
  <!-- Bootstrap CSS -->
  <link href="./bootstrap/bootstrap.css" rel="stylesheet">

  <!-- 나의 스타일 추가 -->
  <link rel="stylesheet" href="./CSS/login.css?v=1234">

</head>
<body class="text-center">

<!--  html 전체 영역을 지정하는 container -->
<div id="container">
  <!--  login 폼 영역을 : loginBox -->
  <div class="input-form-background row">
    <div class="input-form col-md-6 mx-auto">
      <div id="loginBox">
        <!-- 로그인 페이지 타이틀 -->
        <div id="loginBoxTitle">EDI Board Login</div>
        <!-- 아이디, 비번, 버튼 박스 -->
        <form name="login_frm" action="loginAction.jsp" method="post">
          <div id="inputBox">
            <div class="input-form-box"><span>ID</span><input type="text" name="mbID" class="form-control"></div>
            <div class="input-form-box"><span>PW</span><input type="password" name="mbPW" class="form-control"></div>
            <div class="button-login-box">
              <button type="button" class="btn btn-secondary" onclick="inputCheck()">로그인</button>
              <button type="button" class="btn btn-secondary" onclick="location.href='loginForm.do'">회원가입</button>
            </div>
          </div>
        </form>
      </div>
    </div>
    </div>
  </div>
<script>
  function inputCheck(){
    if(document.getElementsByTagName('input').item(0).value == ""){
      alert("아이디를 써주세요.");
      document.getElementsByName('mbID')[0].focus();
    } else {
        if(document.getElementsByTagName('input').item(1).value == ""){
          alert("비밀번호를 써주세요.");
          document.getElementsByName('mbPW')[0].focus();
        } else {
          document.login_frm.submit();
        }
      }
    }
</script>
<!-- Bootstrap Bundle with Popper -->
<link href="./bootstrap/bootstrap.js" rel="stylesheet">
</body>
</html>
