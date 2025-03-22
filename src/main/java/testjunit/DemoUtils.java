package testjunit;

import java.util.Arrays;
import java.util.List;

public class DemoUtils {
	
	int add(int a,int b) {
		return a+b;
	}
	int addition(int... a) {
		int res=0;
		for(int i:a) {
			res+=i;
		}
		return res;
	}
	int multiply(int a,int b) {
		return a*b;
	}
	static boolean isEven(int num) {
		return num%2==0;
	}
	static String getMessage() {
		return null;
	}
	static int[] getNumbers() {
		return new int[] {1,2,3,4};
	}
	static List<String> getNames(){
		return Arrays.asList("Asha","Bala","Charu");
	}
	static void throwException() {
		throw new RuntimeException("This is an exception");
	}

	public static void main(String[] args) {
		DemoUtils d=new DemoUtils();
		System.out.println(d.add(2, 2));
		System.out.println(d.multiply(10, 10));

	}

}
