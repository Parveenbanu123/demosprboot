package com.mph;
class TestException extends Exception{

}
class A1{
	public String sayHello(String name) throws TestException{
		if(name==null)
			throw new TestException();
		return "Hello "+name;
	}
}
public class TestA {

	public static void main(String[] args) {
				try {
					new A1().sayHello("Aiko");//Unhandled Exception if no try catch
				} catch (TestException e) {
					e.printStackTrace();
				}
			
			
		

	}

}
