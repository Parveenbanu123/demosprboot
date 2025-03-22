package com.mph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortCollectionDemo {

	public static void main(String[] args) {
		int[] intArr= {45,78,12,6,50};
		System.out.println(Arrays.toString(intArr));
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		
		List list=new ArrayList();
		list.add(45);
		list.add(78);
		list.add(12);
		list.add(1);
		list.add(25);
		list.add(6);
		list.add(49);
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		Employee e1=new Employee(12,"Shiva");
		Employee e2=new Employee(38,"Parveen");
		Employee e3=new Employee(49,"Sathis");
		Employee e4=new Employee(4,"Ram");
		List emplist=Arrays.asList(e1,e2,e3,e4);
		System.out.println(emplist);
		Collections.sort(emplist);
		System.out.println(emplist);
		
		Collections.sort(emplist,Employee.nameComparator);
		System.out.println(emplist);
	}

}
