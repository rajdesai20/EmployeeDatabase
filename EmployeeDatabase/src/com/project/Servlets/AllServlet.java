package com.project.Servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.Methods.GetAllClass;
import com.project.Model.Department;
import com.project.Model.Employee;

@WebServlet("/showall")
public class AllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GetAllClass gac = new GetAllClass();
		
		List<Employee> list_emp = gac.getAllEmp();
		List<Department> list_dept = gac.getAllDept();
		request.setAttribute("emps", list_emp);
		request.setAttribute("depts", list_dept);
		RequestDispatcher rd = request.getRequestDispatcher("displayAll.jsp");
		rd.forward(request, response);
		
		
	}

}
