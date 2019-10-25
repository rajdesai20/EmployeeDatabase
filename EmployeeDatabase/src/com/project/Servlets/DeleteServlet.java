package com.project.Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.Methods.DeleteClass;


@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String type = request.getParameter("formname");
		DeleteClass ds = new DeleteClass();
		if(type.equals("emp_del")) {
			ds.deleteEmp(id);
		}
		if(type.equals("dept_del")) {
			System.out.println("a");
			ds.deleteDept(id);
		}
		response.sendRedirect("home.jsp");
	}
}
