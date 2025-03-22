package com.mph;

public class BuildStuff {

	public static void main(String[] args) {
		Boolean t = new Boolean(true);
		Integer x = 343;
		Integer y = new BuildStuff().go(t, x);
		System.out.println(y);

		StringBuffer sb = new StringBuffer("123456789");
		sb.delete(0, 3).replace(1, 3, "24").delete(4, 6);
		System.out.println(sb);// 4247
		//delete,replace(inclusive,exclusive) starts with 0
		StringBuilder sb1 = new StringBuilder("123456789");
		sb1.delete(0, 3).delete(1, 3).delete(2, 5).insert(1, "24");
		System.out.println(sb1);// 4247
	}

	int go(Boolean b, int i) {
		if (b)
			return (i / 7);
		return (i / 49);
	} 
}
