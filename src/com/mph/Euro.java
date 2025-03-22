package com.mph;
class Money{
	private String country="Canada";
	public String getC() {
		return country;
	}
}
class Yen extends Money{
	public String getC() {
		//return super.country;//not visible bcaz private in Parent
		return super.getC();
	}
}
public class Euro extends Money {
	public String getC(int x) {
		return super.getC();
	}
	public static void main(String[] args) {
		System.out.println(new Yen().getC()+" "+new Euro().getC());

	}

}
