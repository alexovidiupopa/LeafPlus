package com.sample;

import Model.Entities.Project;
import Model.Entities.Student;
import Repository.*;
import Service.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(
        name = "firstservlet22",
        urlPatterns = "/login"
)
public class FirstServlet extends HttpServlet {
    private List<Dashboard> services;
    @Override
    public void init() throws ServletException{

        services=  new ArrayList<Dashboard>() ;
        ProjectRepository projRepo = new ProjectRepository();
        Repository clientRepo = new ClientRepository();
        Dashboard<Project> projectService = new StudentService(projRepo,clientRepo);
        services.add(projectService);

        Repository studRepo = new StudentsRepository();
        Dashboard<Student> studentDashboard = new ClientsService(studRepo);
        services.add(studentDashboard);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("user");
        String pwd = req.getParameter("pwd");

        if (req.getParameter("type").equals("Student")) {
            System.out.println("Checking login as a student...");
            if(((ClientsService)services.get(1)).validPwd(username,pwd)){
                System.out.println("successful student login! Welcome " + username);
                req.setAttribute("projects", ((StudentService)services.get(0)).getAll());
                RequestDispatcher view = req.getRequestDispatcher("TemplateHtml/dashboardProject.jsp");
                view.forward(req, resp);
            }
            else {
                System.out.println("Wrong credentials..");
            }
        }
        else {
            System.out.println("Checking login as a client...");
            //TODO check the actual login
            if(((StudentService)services.get(0)).validClientUserPwd(username,pwd)){
                System.out.println("successful client login! Welcome " + username);
                List<Student> allStuds = ((ClientsService)services.get(1)).getAllStudents();
                req.setAttribute("students",allStuds);
                RequestDispatcher view = req.getRequestDispatcher("TemplateHtml/dashboardStudents.jsp");
                view.forward(req, resp);
            }
            else
            {
                System.out.println("Wrong credentials..");
            }
        }

    }
}


