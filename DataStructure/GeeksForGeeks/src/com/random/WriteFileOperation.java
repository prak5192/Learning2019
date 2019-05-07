package com.random;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class WriteFileOperation {
	public static void main(String args[]) throws IOException{
		File file = new File("resource\\WriteFile.txt");
		FileOutputStream fos = new FileOutputStream(file);
		 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
	 
		for (long i = 0; i < 9999999	; i++) {
			bw.write(i + ": This is testing for wring a big file line by line. Please go ahead and and write is fast. I am ordering it.");
			bw.newLine();
		}
	 
		bw.close();
		
	}
	

}
