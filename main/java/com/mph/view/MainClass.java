package com.mph.view;

import java.util.Scanner;

import com.mph.controller.EmployeeController;

public class MainClass {

	public static void main(String[] args) {
		EmployeeController ec=new EmployeeController();
		Scanner sc=new Scanner(System.in);
		String ch=null;
		do {
			System.out.println("Enter ur choice:");
			System.out.println("1. Add Employee");
			System.out.println("2. View Employee");
			System.out.println("3. Search by ID");
			System.out.println("4. Search by Email");
			System.out.println("5.Seach by Name");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				ec.addEmployee();
				break;
			case 2:
				ec.viewEmployee();
				break;
			case 3:
				ec.getEmpById();
				break;
			case 4:
				ec.searchByEmail();
				break;
			case 5:
				ec.searchByName();
				break;
			default:
				System.out.println("Enter the right choice");
			}
			System.out.println("Do u want to continue? Y|y");
			ch=sc.next();
		}while(ch.equals("Y")||ch.equals("y"));

	}

}
