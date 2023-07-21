package com.rays.Io;

import java.io.FileReader;

public class TestRealByChar {
	public static void main(String[] args) throws Exception{
		
		FileReader in = new FileReader("C:\\Users\\India\\Desktop\\io\\vikash.txt");
		
		 int ch = in.read();
		 
		 while (ch!=-1) {
			 System.out.println((char)ch);
			 ch= in.read();
			
		}
		in.close();
	}

}
