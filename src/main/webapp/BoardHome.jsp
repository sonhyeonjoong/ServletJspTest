<%--
  Created by IntelliJ IDEA.
  User: KDN User
  Date: 2023-02-17
  Time: PM 3:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import= "java.util.ArrayList"%>
<%@ page import="com.example.demo3.vo.GeneralVO" %>
<%
  ArrayList<GeneralVO> list = (ArrayList<GeneralVO>) request.getAttribute("list");
%>
<!DOCTYPE html>
<head>
  <title>Board</title>
  <script src="https://code.jquery.com/jquery-1.11.3.js" type="text/javascript"></script>
  <link href="./bootstrap/bootstrap.css" rel="stylesheet">
  <link href="CSS/BoardHome.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="container">
  <div class="row">
    <div class="col-xl-3 col-md-6">
      <div class="card bg-pattern">
        <div class="card-body">
          <div class="float-right">
            <i class="fa fa-archive text-primary h4 ml-3"></i>
          </div>
          <h5 class="font-size-20 mt-0 pt-1"><%=list.size()%></h5>
          <p class="text-muted mb-0">총 게시글</p>
        </div>
      </div>
    </div>
    <div class="col-xl-3 col-md-6">
      <div class="card bg-pattern">
        <div class="card-body">
          <div class="float-right">
            <i class="fa fa-th text-primary h4 ml-3"></i>
          </div>
          <h5 class="font-size-20 mt-0 pt-1">0</h5>
          <p class="text-muted mb-0">개발중</p>
        </div>
      </div>
    </div>
    <div class="col-xl-3 col-md-6">
      <div class="card bg-pattern">
        <div class="card-body">
          <div class="float-right">
            <i class="fa fa-file text-primary h4 ml-3"></i>
          </div>
          <h5 class="font-size-20 mt-0 pt-1">0</h5>
          <p class="text-muted mb-0">개발중</p>
        </div>
      </div>
    </div>
    <div class="col-xl-3 col-md-6">
      <div class="card">
        <div class="card-body">
          <form>
            <div class="form-group mb-0">
              <label>Search</label>
              <div class="input-group mb-0">
                <input type="text" class="form-control" placeholder="Search..." aria-describedby="project-search-addon" />
                <div class="input-group-append">
                  <button class="btn btn-danger" type="button" id="project-search-addon"><i class="fa fa-search search-icon font-12"></i></button>
                </div>
              </div>
            </div>
          </form>
        </div>
      </div>
    </div>
  </div>
  <!-- end row -->

  <div class="row">
    <div class="col-lg-12">
      <div class="card">
        <div class="card-body">
          <div class="table-responsive project-list">
            <table class="table project-table table-centered table-nowrap">
              <thead>
              <tr>
                <th scope="col"></th>
                <th scope="col">번호</th>
                <th scope="col">작성자</th>
                <th scope="col">제목</th>
                <th scope="col">내용</th>
                <th scope="col">조회수</th>
                <th scope="col">작성날짜</th>
              </tr>
              </thead>
              <tbody>
              <%
                if (list !=null && list.size() > 0) {
                  for (int i = 0; i < list.size() && i < 10; i++) {
              %>
              <tr>
                <th scope="row"></th>
                <td><%=list.get(i).getBId()%></td>
                <td><%=list.get(i).getMbId()%></td>
                <td href="BoardRead.do?subject=<%=list.get(i).getSubject()%>"><%=list.get(i).getSubject()%></td>
                <td><%=list.get(i).getContent()%></td>
                <td><%=list.get(i).getHit()%></td>
                <td><%=list.get(i).getWDate()%></td>
              </tr>
              <%
                  }
                }
              %>
              </tbody>
            </table>
          </div>
          <div class="pt-3 whi">
            <ul class="pagination justify-content-lg-end mb-0" >
              <li class="page-item">
                <a class="page-link" href="./BoardWrite.jsp">글쓰기</a>
              </li>
            </ul>
            <ul style="font-size: 0.04em;"></ul>
            <ul class="pagination justify-content-end mb-0" >
              <li class="page-item disabled">
                <a class="page-link" href="#" tabindex="-1" aria-disabled="true">Previous</a>
              </li>
              <li class="page-item active"><a class="page-link" href="#">1</a></li>
              <li class="page-item"><a class="page-link" href="#">2</a></li>
              <li class="page-item"><a class="page-link" href="#">3</a></li>
              <li class="page-item">
                <a class="page-link" href="#">Next</a>
              </li>
            </ul>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
<link href="./bootstrap/bootstrap.js" rel="stylesheet">
</body>
</html>
