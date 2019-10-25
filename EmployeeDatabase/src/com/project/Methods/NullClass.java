package com.project.Methods;

import com.project.Model.Department;
import com.project.Model.Employee;

public class NullClass {
	public static Employee Null_emp() {
		Employee emp = new Employee();
		emp.setEid(0);
		emp.setFname("NA");
		emp.setLname("NA");
		return emp;
	}
	public static Department Null_dept() {
		Department dept =new Department();
		dept.setDid(0);
		dept.setDname("NA");
		return dept;
	}
}
