package com.project.Session;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.project.Model.Department;
import com.project.Model.Employee;

public class SessionProvide {
	
	public static Session getSession() {
		Configuration conn = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class);
		SessionFactory sf = conn.buildSessionFactory();
		Session session = sf.openSession();
		return session;
	}

}
