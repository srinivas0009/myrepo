package org.emp;

import java.sql.Date;

import javax.swing.Spring;

public class Employee {

	public void employeeid(int a) {
		// TODO Auto-generated constructor stub
		System.out.println(a);
		
	}
public void employeename(String b) {
	System.out.println("ramesh");
}
public void employeeDob(int c) {
	System.out.println(20-19-1996);
}
public void empphone(long d) {
	System.out.println(8072212408l);
}
public void empemail(String e) {
	System.out.println("srinivastheengneer@gmail.com");
}
public void empaddress(String f) {
	System.out.println("no 229,nehru street,tambaram,chennai");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ob = new Employee ();
		ob.employeeid(1);
		ob.employeename("b");
		ob.employeeDob('c');
		ob.empphone('d');
		ob.empemail("e");
		ob.empaddress("f");
	}
}
