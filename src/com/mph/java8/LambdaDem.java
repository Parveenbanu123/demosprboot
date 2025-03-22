package com.mph.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

import com.mph.Employee;

public class LambdaDem {
	public static void main(String[] args) {
				//JAVA8
		
		//Java-8 way-1
		Runnable r=()-> {
				Task t=new Task();
				t.show();
		};
		Thread th=new Thread(r);
		th.start();
		
		
		//Java-8 way-2
		Thread t1=new Thread(()->{
			Task t=new Task();
			t.show();
		});
		t1.start();
		
		
		//Java-8 way-3
		new Thread(()->{
			Task t=new Task();
			t.show();
		}).start();
		
		
		//Java-8 way-4
		new Thread(()->{
			new Task().show();
		}).start();
		
		
		//Java-8 way-5
		//Method Reference
		new Thread(new Task()::show).start();
		
		Employee e1=new Employee(12,"shiva");
		Employee e2=new Employee(10,"ram");
		Employee e3=new Employee(5,"avni");
		
		List<Employee> elist=Arrays.asList(e1,e2,e3);
		System.out.println(elist);
		//elist.forEach(li->System.out.println(li));
		elist.forEach(System.out::println);
		
		
		//BiPredicate FI
		BiPredicate<String,String> p=(un,pw)->un.equals("Parveen")&&pw.equals("pass");
		if(p.test("Parveen", "pass")) {
			System.out.println("OK");
		}
		else {
			System.out.println("NOT OK");
		}
		
		//Supplier FI
		Supplier  s=()->{return "Hello";};
		System.out.println(s.get());
		
		//Function FI
		Function<Integer,String> f=(num)->{
			if(num % 2==0) {
				return "Even";
			}
			else {
				return "Odd";
			}
		};
		System.out.println(f.apply(38));
		
		
		
		
		
		
				//Java-7
		
		
//		Task t=new Task();
//		t.show();
//		
//		MyThread mt=new MyThread();
//		Thread th=new Thread(mt);
//		th.start();
//		
//		Runnable r=new Runnable() {
//			@Override
//			public void run() {
//				Task t=new Task();
//				t.show();
//			}	
//		};
//		Thread thr=new Thread(r);
//		thr.start();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
