package com.mph.view;

import java.util.Scanner;
import java.util.function.BiPredicate;

import com.mph.controller.EmployeeController;
import com.mph.exception.UserNotFoundException;

public class MainClass {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the UserName:");
			String user = sc.next();
			System.out.println("Enter the Password:");
			String pwd = sc.next();
			BiPredicate<String,String> bi=(un,pw)->un.equals("Parveen")&&pw.equals("pass");
			if (bi.test(user,pwd)) {
				System.out.println("Welcome");
				EmployeeController ec = new EmployeeController();
				String ch = null;
				do {
					System.out.println("Enter your choice:");
					System.out.println("1. Add Employee");
					System.out.println("2. View Employee");
					System.out.println("3. Add To Array");
					System.out.println("4. Sort By EmpNumber");
					System.out.println("5. Sort By EmpName");
					System.out.println("6. Serialize");
					System.out.println("7. Deserialize");
					System.out.println("8. Get ResultSetMetaData");
					System.out.println("9. Get DatabaseMetaData");
					int choice = sc.nextInt();
					switch (choice) {
					case 1:
						ec.addEmp();
						break;
					case 2:
						ec.viewEmp();
						break;
					case 3:
						ec.addEmpToArray();
						break;
					case 4:
						ec.sortEmpByNumber();
						break;
					case 5:
						ec.sortEmpByName();
						break;
					case 6:
						ec.serializeEmp();
						break;
					case 7:
						ec.deserializeEmp();
						break;
					case 8:
						ec.getResultsetMetaData();
						break;
					case 9:
						ec.getDatabaseMetaData();
						break;
					default:
						System.out.println("Enter the right choice...");
					}
					System.out.println("Do you want to continue? Y|y");
					ch = sc.next();
				} while (ch.equals("Y") || ch.equals("y"));
			} else {
				throw new UserNotFoundException();
			}
		} catch (UserNotFoundException e) {
			e.printStackTrace();
		}
		finally{
			System.out.println("Completed...");
		}
	}

}
