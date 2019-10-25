package com.project.Methods;

import org.hibernate.Session;

import com.project.Model.Department;
import com.project.Model.Employee;
import com.project.Session.SessionProvide;

public class GetClass {
	
	public Employee getEmp(int id) {
		Session session = SessionProvide.getSession();
		session.beginTransaction();
		Employee emp =   session.get(Employee.class, id);
		if(emp == null) {
			Employee emp1 = NullClass.Null_emp();
			return emp1;
		}
		session.getTransaction().commit();
		session.close();
		return emp;
	}
	public Department getDept(int id) {
		Session session = SessionProvide.getSession();
		session.beginTransaction();
		Department dept=  session.get(Department.class, id);
		if(dept == null) {
			Department dept1 = NullClass.Null_dept();
			session.close();
			return dept1;
		}
		session.getTransaction().commit();
		session.close();
		return dept;
	}

}
