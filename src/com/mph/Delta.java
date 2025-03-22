package com.mph;
interface Foo{
	
}
class Alpha implements Foo{
	
}
class Beta extends Alpha{
	
}
class Delta extends Beta{

	public static void main(String[] args) {
		Beta x=new Beta();
		//Alpha a=x; instance created for Beta
		Foo f=(Delta)x;//ClassCastException
		//Foo f=(Alpha)x;instance created for Beta
		//Beta b=(Beta)(Alpha)x;instance created for Beta
		//System.out.println(b);
	}

}
