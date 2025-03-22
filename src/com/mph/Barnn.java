package com.mph;
class Building{
	
}
public class Barnn extends Building{

	public static void main(String[] args) {
		Building build1=new Building();
		Barnn barn1=new Barnn();
		Barnn barn2=(Barnn)build1;
		Object obj1=(Object)build1;
		//String str1=(String)build1;//Cannot cast from Building to String 
		Building build2=(Building)barn1;
	}
}
