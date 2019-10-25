package com.project.Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.Methods.GetClass;
import com.project.Model.Department;
import com.project.Model.Employee;

@WebServlet("/view")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String type= request.getParameter("formname");
		GetClass gc = new GetClass();
		if(type.equals("emp_view")) {
			Employee emp = gc.getEmp(id);
			request.setAttribute("eid", emp.getEid());
			request.setAttribute("fname", emp.getFname());
			request.setAttribute("lname", emp.getLname());
			RequestDispatcher rs = request.getRequestDispatcher("display_e.jsp");
			rs.forward(request, response);
	}
		if(type.equals("dept_view")) {
			Department dept = gc.getDept(id);
			request.setAttribute("did", dept.getDid());
			request.setAttribute("dname", dept.getDname());
			RequestDispatcher rs =request.getRequestDispatcher("display_d.jsp");
			rs.forward(request, response);
		}
	}
}
