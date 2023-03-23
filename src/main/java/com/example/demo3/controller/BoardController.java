package com.example.demo3.controller;

import com.example.demo3.action.ArticleListAction;
import com.example.demo3.action.JoinListAction;
import com.example.demo3.action.insertMemberAction;
import com.example.demo3.common.Action;
import com.example.demo3.common.ActionForward;
import com.example.demo3.vo.ArticleVO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "BoardServlet", value = "*.do")
public class BoardController extends HttpServlet {
    private  static final long serialVersionUID = 1L;

    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String RequestURI = request.getRequestURI();
        String contextPath = request.getContextPath();
        String command = RequestURI.substring(contextPath.length());
        ActionForward forward = null;
        Action action = null;
        // Modulization of event processing controller
        if (command.equals("/BoardHome.do")) {
            action = new JoinListAction();
            try {
                forward = action.execute(request, response);
                RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
                dispatcher.forward(request, response);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if (command.equals("/register.do")){
            if (request.getMethod().equals("GET")){
                RequestDispatcher dispatcher = request.getRequestDispatcher("./login.jsp");
                dispatcher.forward(request, response);
            } else if (request.getMethod().equals("POST")) {
                try {
                    action = new insertMemberAction();
                    forward = action.execute(request, response);
                    RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
                    dispatcher.forward(request, response);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Not permitted HTTP method!");
            }
        }
        else {
            try {
                if (command.equals("/login.do")) {
                    RequestDispatcher dispatcher = request.getRequestDispatcher("./login.jsp");
                    dispatcher.forward(request, response);
                }
                else if (command.equals("/loginForm.do")) {
                    RequestDispatcher dispatcher = request.getRequestDispatcher("./loginForm.jsp");
                    dispatcher.forward(request, response);
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    public BoardController() {
        super();
    }
    protected  void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        doProcess(request, response);
    }
    protected  void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doProcess(request, response);
    }
}
