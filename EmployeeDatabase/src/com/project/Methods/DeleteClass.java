package com.project.Methods;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.project.Model.Department;
import com.project.Model.Employee;
import com.project.Session.SessionProvide;

public class DeleteClass {
	public void deleteEmp(int id) {
		Session session = SessionProvide.getSession();
		session.beginTransaction();
		GetClass gc =new GetClass();
		Employee emp = gc.getEmp(id);
		session.delete(emp);
		session.getTransaction().commit();
		session.close();
	}
	public void deleteDept(int id) {
		System.out.println("b");
		Session session = SessionProvide.getSession();
		session.beginTransaction();
		GetClass gc =new GetClass();
		Department dept = gc.getDept(id);
		session.delete(dept);
		System.out.println("d");
		session.getTransaction().commit();
		session.close();
	}
}
