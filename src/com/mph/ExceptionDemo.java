package com.mph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Fourth {
	public void divide() throws IOException{
		
	try 
	{
		int x=0,y=0,z=0;
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		System.out.println("Enter x:");
		x=Integer.parseInt(br.readLine());
		System.out.println("Enter y:");
		y=Integer.parseInt(br.readLine());
		z=x/y;
		System.out.println("z="+z);
	} //Correct way of mentioning catch blocks
	catch (ArithmeticException e) {
		System.out.println("Don't divide by 0");
	} 
	catch (NumberFormatException e) {
		System.out.println("Don't divide by character");
	}
	catch (Exception e) {//always in last, it works when we don't know the specific exceptions
		System.out.println(e);
	}
	}
}
class Fifth extends Fourth{
	public void divide(){
		
		try 
		{
			int x=0,y=0,z=0;
			
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			
			System.out.println("Enter x:");
			x=Integer.parseInt(br.readLine());
			System.out.println("Enter y:");
			y=Integer.parseInt(br.readLine());
			z=x/y;
			System.out.println("z="+z);
		} 
		catch (ArithmeticException e) {
			System.out.println("Don't divide by 0");
		} 
		catch (NumberFormatException e) {
			System.out.println("Don't divide by character");
		}
		catch (Exception e) {
			System.out.println(e);
		}
		}
}
public class ExceptionDemo {

	public static void main(String[] args) throws IOException {//Checked exception
//		Scanner sc=new Scanner(System.in);
		System.out.println("Started...");
		Fourth f=new Fourth();
		f.divide();
		Fourth f1=new Fifth();
		f1.divide();
		System.out.println("Ended...");
		
	}

}
