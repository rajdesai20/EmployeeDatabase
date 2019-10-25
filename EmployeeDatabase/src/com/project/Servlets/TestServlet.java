package com.project.Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.Methods.CreateClass;
import com.project.Methods.GetClass;
import com.project.Model.Department;
import com.project.Model.Employee;

@WebServlet("/create")
public class TestServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entering Servlet");
		Employee emp = new Employee();
		emp.setEid(Integer.parseInt(request.getParameter("eid")));
		emp.setFname(request.getParameter("fname"));
		emp.setLname(request.getParameter("lname"));
		GetClass gc =new GetClass();
		Department dept=  gc.getDept(Integer.parseInt(request.getParameter("department")));
		emp.setDepartment(dept);
		CreateClass cc = new CreateClass();
		System.out.println("Calling method");

		cc.create(emp);
		response.sendRedirect("home.jsp");
	}

}
