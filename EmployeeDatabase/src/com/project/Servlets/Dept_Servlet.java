package com.project.Servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.Methods.CreateClass;
import com.project.Methods.GetClass;
import com.project.Model.Department;
import com.project.Model.Employee;

@WebServlet("/create1")
public class Dept_Servlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Department dept = new Department();
		dept.setDid(Integer.parseInt(request.getParameter("did")));
		dept.setDname(request.getParameter("dname"));
		String[] emps = request.getParameterValues("employee");
		List<Employee> list_emps = new ArrayList<Employee>();
		int i=0;
		Employee emp;
		GetClass gc =new GetClass();
		CreateClass cc =new CreateClass();
		if(emps!=null) {
		for(String a : emps) {
			i = Integer.parseInt(a);
			emp= gc.getEmp(i);
			emp.setDepartment(dept);
			list_emps.add(emp);
		}}
		dept.setEmployee(list_emps);
		cc.create(dept);
		response.sendRedirect("home.jsp");
	}

}
