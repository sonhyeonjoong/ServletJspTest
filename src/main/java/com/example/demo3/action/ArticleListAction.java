package com.example.demo3.action;

import com.example.demo3.common.Action;
import com.example.demo3.common.ActionForward;
import com.example.demo3.service.BoardService;
import com.example.demo3.vo.ArticleVO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.ArrayList;

public class ArticleListAction implements Action {
    // Get list from Service and forward to jsp
    @Override
    public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        BoardService svc = new BoardService();
        ArrayList<ArticleVO> articleList = svc.getArticleList();
        ActionForward forward = new ActionForward();
        request.setAttribute("list", articleList);
        forward.setPath("#");
        return forward;
    }
}
