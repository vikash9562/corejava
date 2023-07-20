package com.rays.compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class listTestStream {
	public static void main(String[] args) {
		
		List<String> iteam = Arrays.asList("one","two","three","four","four","fife");
		
		Stream<String> stream = iteam.stream();
		
		stream.sorted().filter(e->e.startsWith(e)).map(e->e.toUpperCase()).forEach(e->{System.out.println(e);});
	}

}
