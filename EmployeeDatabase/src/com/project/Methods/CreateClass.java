package com.project.Methods;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.project.Model.Department;
import com.project.Model.Employee;
import com.project.Session.SessionProvide;

public class CreateClass {
	
	DeleteClass dc =new DeleteClass();
	public void create(Employee emp) {
		Session session = SessionProvide.getSession();
		session.beginTransaction();
		session.delete(emp);
		session.save(emp);
		session.getTransaction().commit();
		session.close();
	}
	
	public void create(Department dept) {
		Session session = SessionProvide.getSession();
		session.beginTransaction();
		session.delete(dept);
		session.save(dept);
		session.getTransaction().commit();
		session.close();
	}
}
