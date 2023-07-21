package com.rays.Io;

import java.io.FileReader;
import java.io.Reader;
import java.util.Scanner;

public class TestFileByScanner {
	
	public static void main(String[] args) throws Exception {
		
		FileReader in = new FileReader("C:\\Users\\India\\Desktop\\io\\vikash.txt");
		Scanner sc  = new Scanner(in);
		
		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
			
		}
		in.close();
		sc.close();
		
	}

}
