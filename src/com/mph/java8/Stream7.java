package com.mph.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream7 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Rat", "Cat", "Mat", "", "Lion", "Elephant", "Tiger");
		System.out.println(list);

		long count = countStrWithLen3(list);
		System.out.println("Count= " + count);
		
		List<String> slist=getStrWithLen3(list);
		System.out.println("str with length 3: "+slist);
		
		long ce=getCountOfEmptyStr(list);
		System.out.println("Count of Empty String: "+ce);
		
		List<Integer> intList=Arrays.asList(1,2,4,5,3,7,9,2);
		System.out.println(intList);
		
		int max=getMaxNumberFromList(intList);
		System.out.println("Max= "+max);
	}

	private static int getMaxNumberFromList(List<Integer> intList) {
		int max=intList.get(0);
		for(int i=1;i<intList.size();i++) {
			Integer num=intList.get(i);
			if(num>max) {
				max=num;
			}
		}
		return max;
	}

	private static long getCountOfEmptyStr(List<String> list) {
		int c=0;
		for (String str : list) {
			if (str.isEmpty()) {
				c++;
			}
		}
		return c;
	}

	private static List<String> getStrWithLen3(List<String> list) {
		List<String> ans=new ArrayList<>();
		for (String str : list) {
			if (str.length() == 3) {
				ans.add(str);
			}
		}
		return ans;
	}

	private static long countStrWithLen3(List<String> list) {
		int count = 0;
		for (String str : list) {
			if (str.length() == 3) {
				count++;
			}
		}
		return count;
	}
}
