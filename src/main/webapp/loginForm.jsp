<%--
  Created by IntelliJ IDEA.
  User: KDN User
  Date: 2023-02-20
  Time: PM 1:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset=UTF-8">
    <title>회원가입</title>
    <script src="https://code.jquery.com/jquery-1.11.3.js" type="text/javascript"></script>
    <link href="./bootstrap/bootstrap.css" rel="stylesheet">
    <link rel="stylesheet" href="./CSS/loginForm.css">
</head>
<body>
<div class="container">
    <div class="input-form-background row">
        <div class="input-form col-md-9 mx-auto">
            <h4 class="mb-3">회원가입</h4>
            <form name="reg_frm" method="post" action="register.do" novalidate>
                <div class="row">
                    <div class="col-md-6 mb-3 mx-auto">
                        <label>아이디</label>
                        <input type="text" class="form-control" name="mbID" placeholder="" value="" required>
                    </div>
                    <div class="col-md-6 mb-3">
                        <label>닉네임</label>
                        <input type="text" class="form-control" name="mbNickname" placeholder="" value="" required>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-6 mb-3 mx-auto">
                        <label>비밀번호</label>
                        <input type="password" class="form-control" name="mbPW" placeholder="" value="" required>
                    </div>
                    <div class="col-md-6 mb-3">
                        <label>비밀번호 확인</label>
                        <input type="password" class="form-control" name="mbPWCheck" placeholder="" value="" required>
                    </div>
                </div>
                <div class="mb-3">
                    <label>이메일</label>
                    <input type="email" class="form-control" name="mbEmail" placeholder="you@kdn.com" required>
                </div>
                <hr class="mb-4">
                <div class="custom-control custom-checkbox">
                    <input type="checkbox" class="custom-control-input" id="agreement" required>
                    <label class="custom-control-label" for="agreement">개인정보 수집 및 이용에 동의합니다.</label>
                </div>
                <div class="mb-4"></div>
                <button type="button" class="btn btn-secondary mb-3" onclick="inputCheck()">가입 완료</button>
                <button type="button" class="btn btn-secondary mb-3" onclick="location.href='login.do'">취소</button>
            </form>
        </div>
    </div>
    <footer class="my-3 text-center text-small">
        <p class="mb-1">Managed by EDI department</p>
    </footer>
</div>
<script>
    function inputCheck(){
        if(document.getElementsByTagName('input').item(0).value == ""){
            alert("아이디를 써주세요.");
            document.getElementsByName('mbID')[0].focus();
        } else {
            if(document.getElementsByTagName('input').item(1).value == ""){
                alert("닉네임을 써주세요.");
                document.getElementsByName('mbNickname')[0].focus();
            } else {
                if(document.getElementsByTagName('input').item(2).value == ""){
                    alert("패스워드는 반드시 입력해야 합니다.");
                    document.getElementsByName('mbPW')[0].focus();
                } else {
                    if(document.getElementsByTagName('input').item(3).value == "" ||
                        document.getElementsByTagName('input').item(3).value != document.getElementsByTagName('input').item(2).value){
                        alert("패스워드가 일치하지 않습니다.");
                        document.getElementsByName('mbPWCheck')[0].focus();
                    } else {
                        if(document.getElementsByTagName('input').item(4).value == ""){
                            alert("Email을 써주세요.");
                            document.getElementsByName('mbEmail')[0].focus();
                        } else {
                            if (document.getElementById('agreement').checked == true) {
                                document.reg_frm.submit();
                            } else {
                                alert("개인정보동의가 필요합니다.");
                            }
                        }
                    }
                }
            }
        }
    }
</script>
<link href="./bootstrap/bootstrap.js" rel="stylesheet">
</body>

</html>
