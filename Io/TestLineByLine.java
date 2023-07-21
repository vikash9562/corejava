package com.rays.Io;

import java.io.BufferedReader;
import java.io.FileReader;

public class TestLineByLine {
	
	public static void main(String[] args) throws Exception {
		
		FileReader file = new FileReader("C:\\Users\\India\\Desktop\\io\\vikash.txt");
		
		BufferedReader in = new BufferedReader(file);
		
		String line = in.readLine();
		
		while (line != null) {
			System.out.println(line);
			
			line = in.readLine();
			
			
		}
		in.close();
		file.close();
		
	}

}
