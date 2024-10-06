package org.example.DevSync2.Controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.DevSync2.entity.User;
import org.example.DevSync2.service.UserService;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "manager" , urlPatterns = "/manager")
public class ManagerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher dispatcher = request.getRequestDispatcher("manager/manager.jsp");
        dispatcher.forward(request, response);
    }

}
