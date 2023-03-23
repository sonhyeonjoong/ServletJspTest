package com.example.demo3.action;

import com.example.demo3.common.Action;
import com.example.demo3.common.ActionForward;
import com.example.demo3.service.BoardService;
import com.example.demo3.vo.GeneralVO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.ArrayList;

public class JoinListAction implements Action {
    @Override
    public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        BoardService svc = new BoardService();
        ArrayList<GeneralVO> joinList = svc.getJoinList();
        ActionForward forward = new ActionForward();
        request.setAttribute("list", joinList);
        forward.setPath("./BoardHome.jsp");
        return forward;
    }
}
