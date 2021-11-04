package com.ss.a3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment3 {
	public static void main(String[] args) throws IOException {
		System.out.println("please enter a character to check");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char given = (char) br.read();
		br.close();

		File file = new File("./resources/in/sampleFile.txt");   
	    FileReader fr=new FileReader(file);  
	    int count = 0;
	    br=new BufferedReader(fr);  
	      int c = 0;             
	      while((c = br.read()) != -1)         
	      {
	            char character = (char) c;    
	            if (character == given)
	            	count++;
	      }
	      System.out.println(count);
	   }
	
}
