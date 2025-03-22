package com.mph;

public class StringDemo {

	public static void main(String[] args) {
		//Mutable String-->StringBuffer,StringBuilder
		StringBuffer sb=new StringBuffer("Good");
		System.out.println(sb.hashCode());
		System.out.println(sb.toString());
		sb.append("Evening");
		System.out.println(sb.hashCode());
		System.out.println(sb.toString());
		//StringBuffer is Thread Safe(Slower)
		StringBuilder sbi=new StringBuilder("Good");
		System.out.println(sbi.hashCode());
		System.out.println(sbi.toString());
		sb.append("Evening");
		System.out.println(sbi.hashCode());
		System.out.println(sbi.toString());
		
		
		
		
		
		
		
		
		
		/*String s1=" Java ";
		String s2=new String("Java");
		String s3="I Love Java";
		String s4="java";
		String s5=null;
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s2.charAt(2));
		System.out.println(s4.length());
		//System.out.println(s5.length());//Exception bcz NULL
		//System.out.println(s5.isEmpty());//Exception
		System.out.println(s4.isBlank());
		System.out.println(s1.trim().concat(" Programming"));
		System.out.println(s3.contains(s2));
		System.out.println(s1.hashCode());
		System.out.println(s1==s2);
		System.out.println(s1.indexOf("J"));
		System.out.println(s1.compareTo(s4));
		System.out.println(s3.substring(2,8));//substring is overloaded method
		System.out.println(s1.trim());
		System.out.println(s3.lastIndexOf("Java"));
		System.out.println();*/
	}

}
