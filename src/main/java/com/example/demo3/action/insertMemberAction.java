package com.example.demo3.action;

import com.example.demo3.common.Action;
import com.example.demo3.common.ActionForward;
import com.example.demo3.service.BoardService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class insertMemberAction implements Action {
    // Get list from Service and forward to jsp
    @Override
    public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        BoardService svc = new BoardService();
        int re = -1;
        String id = request.getParameter("mbID");
        String nickname = request.getParameter("mbNickname");
        String pw = request.getParameter("mbPW");
        String name = request.getParameter("mbName");
        String email = request.getParameter("mbEmail");
        re = svc.insertMember(id, nickname, pw, name, email);
        ActionForward forward = new ActionForward();
        if (re == 1){
            forward.setPath("./login.jsp");
        } else {
            System.out.println("사용자 정보 등록 실패");
        }
        return forward;
    }
}
