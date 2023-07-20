package com.rays.compare;

import java.util.Arrays;
import java.util.stream.Stream;

public class arrTestStream {
	public static void main(String[] args) {
		String[]arr = {"vikash","sachin","naman","naman","deepak","sandeep"};
		
		Stream<String> list = Arrays.stream(arr);
		list.distinct().sorted().filter(e->e.startsWith(e)).map(e->e.toUpperCase()).forEach(e->{System.out.println(e);});
		
	}

}
