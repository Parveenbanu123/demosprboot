package com.mph;

import java.util.*;
public class CollectionDemo {
	public static void main(String[] args) {
		//List list=new ArrayList();
		//List list=new LinkedList();
		List<Integer> list=new Vector<Integer>();//Generic
		list.add((int)'a');
		list.add((int)'A');
		list.add(38);
		list.add(1);
		list.add(49);
		list.add(47);
		list.add(40);
		//System.out.println(list);
		Iterator<Integer> i=list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		Set set=new HashSet();
		//Set set=new TreeSet();//ClassCastException
		set.add("Shiva");
		set.add("Ram");
		set.add("Shiva");
		set.add(1);
		set.add(2.5);
		set.add(true);
		set.add(null);
		//System.out.println(set);
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//Map map=new HashMap();
		Map map=new TreeMap();
		//Map map=new Hashtable();//NullPointerException
		map.put(1,"Shiva");
		map.put(2,"Ram");
		map.put(3,"Shiva");
		map.put(4,1);
		map.put(5,2.5);
		map.put(6,true);
		map.put(7,null);
		map.put(8,null);
		System.out.println(map);
		Collection c=map.values();
		Iterator im=c.iterator();
		while(im.hasNext()) {
			System.out.println(im.next());
		}
	}
}
