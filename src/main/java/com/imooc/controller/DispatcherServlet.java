package com.imooc.controller;

import com.imooc.controller.frontend.MainPageController;
import com.imooc.controller.superadmin.HeadLineOperationController;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class DispatcherServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Thread: " + Thread.currentThread().getName());
        if ("/frontend/getmainpageinfo".equals(req.getServletPath()) && "GET".equals(req.getMethod())) {
            new MainPageController().getMainPageInfo(req, resp);
        } else if ("/superadmin/addheadline".equals(req.getServletPath()) && "POST".equals(req.getMethod())) {
            new HeadLineOperationController().addHeadLine(req, resp);
        }

    }
}
