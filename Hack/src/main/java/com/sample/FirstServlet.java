package com.sample;

import Model.Entities.Project;
import Model.Entities.Student;
import Repository.*;
import javafx.concurrent.Service;
import Service.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "firstservlet22",
        urlPatterns = "/getAll"
)
public class FirstServlet extends HttpServlet {
    @Override
    public void init() throws ServletException{

        ProjectRepository repo = new ProjectRepository();
        Dashboard<Project> projectService = new StudentService(repo);
        for (Project p : projectService.populate(repo.getAll())){
            System.out.println(p);
        }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("user");
        String pwd = req.getParameter("pwd");

        System.out.println(username);
        System.out.println(pwd);
        req.setAttribute("out","done");

        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
        view.forward(req, resp);
    }
}


