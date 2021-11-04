/**
 * 
 */
package com.ss.a2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Jacob
 *
 */
public class Assignment2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			File file = new File("./resources/in/test2.txt");
//			InputStream is = new FileInputStream("/resources/in/test2.txt");
			FileWriter fileWritter = new FileWriter(file,true);
	         BufferedWriter bw = new BufferedWriter(fileWritter);
	         bw.write(" Success");
	         bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
