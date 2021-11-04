/**
 * 
 */
package com.ss.a1;

import java.io.File;

/**
 * @author Jacob
 *
 */
public class Assignment1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	File file = new File("./");
	File[] fileList = file.listFiles();

		// recursive function is needed in order to check subdirectories
		recursiveFun(fileList,0);
	}
	

	/**
	 * @param fileList - list of files in the directory
	 * @param depth - needed for spacing nested files 
	 */
	private static void recursiveFun(File[] fileList, int depth) {
		for(File f : fileList) {
			for (int i = 0; i < depth; i++)
                System.out.print("-");
		     if (f.isFile())
	                System.out.println(f.getName());
	  
	            else if (f.isDirectory()) {
	                System.out.println(f.getName());
	  
	                // recursion for sub-directories
	                recursiveFun(f.listFiles(), depth + 1);
	            }
		}
		
	}

}
