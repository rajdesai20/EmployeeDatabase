package com.project.Methods;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.project.Model.Department;
import com.project.Model.Employee;
import com.project.Session.SessionProvide;

public class GetAllClass {
	public List<Employee> getAllEmp() {
		String hql = "FROM Employee";
		Session session = SessionProvide.getSession();
		Query query = session.createQuery(hql);
		List<Employee> lists = query.list();
		session.close();
		return lists;
		
	}
	public List<Department> getAllDept(){
		String hql = "FROM Department";
		Session session = SessionProvide.getSession();
		Query query = session.createQuery(hql);
		List<Department> lists = query.list();
		session.close();
		return lists;
	}
}
