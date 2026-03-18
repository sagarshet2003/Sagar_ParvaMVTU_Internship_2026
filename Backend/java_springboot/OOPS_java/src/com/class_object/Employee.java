package com.class_object;

public class Employee {
	String emp_name;
	int emp_id;
	String emp_email;
	
	public String isWorking() {
		return "Yes he is working";
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.emp_name = "mohan";
		emp.emp_id = 111;
		emp.emp_email = "mohan@gmail.com";
		System.out.println("emp_name:"+ emp.emp_name);
		System.out.println("emp_id:"+ emp.emp_id);
		System.out.println("emp_mail:"+ emp.emp_email);
		
		String res = emp.isWorking();
		System.out.println(res);
		
		
		Employee emp1 = new Employee();
		emp1.emp_name = "pavan";
		emp1.emp_id = 121;
		emp1.emp_email = "pavan@gmail.com";
		System.out.println("emp_name;"+ emp1.emp_name);
		System.out.println("emp_id:"+ emp1.emp_id);
		System.out.println("emp_mail:"+ emp1.emp_email);
		System.out.println(res);
	}
}
