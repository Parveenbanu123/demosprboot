package com.mph.java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Stream8 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Rat", "Cat", "Mat", "", "Lion", "Elephant", "Tiger");
		System.out.println(list);

		long count = list.stream().filter(str->str.length() == 3).count();
		System.out.println("Count= " + count);
		
		List<String> slist=list.stream().filter(str->str.length() == 3).collect(Collectors.toList());
		System.out.println("str with length 3: "+slist);
		
		long ce=list.stream().filter(str->str.isEmpty()).count();
		System.out.println("Count of Empty String: "+ce);
		
		List<Integer> intList=Arrays.asList(1,2,4,5,3,7,9,2);
		System.out.println(intList);
		
		intList.stream().sorted().distinct().forEach(System.out::println);
		
		
		IntSummaryStatistics stat=intList.stream().mapToInt(num->num).summaryStatistics();
		int max=stat.getMax();
		int min=stat.getMin();
		double avg=stat.getAverage();
		long sum=stat.getSum();
		long count1=stat.getCount();
		
		System.out.println("Max= "+max+" Min= "+min+" Avg= "+avg+" sum= "+sum+" count= "+count1);
		
		String regex="\\d+";//digits
		// "\\D+"--> Not digit
		// "\\w+"--> all the character
		// "\\W+"--> not character
		String input="The price is: 250 rupees";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(input);
		while(matcher.find()) {
			System.out.println("Found: "+matcher.group());
		}
		
		String email="user@example.com";
		String emailPattern="^[A-Za-z0-9._%+-]+@[A-Za-z0-9]+\\.[A-Z|a-z]{2,}$";
		boolean isValid=Pattern.matches(emailPattern,email);
		System.out.println("Is Valid Email? "+isValid);
	}
}
