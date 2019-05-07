package com.random;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadReverseWay {
	public static void main(String args[]) throws IOException{
		//File file = new File("resource\\ReadReverseFileInput.txt");
		File file = new File("resource\\WriteFile.txt");
		ReverseLineInputStream rlis = new ReverseLineInputStream(file);
		BufferedReader in = new BufferedReader (new InputStreamReader(rlis));
		
		while(true) {
		    String line = in.readLine();
		    if (line == null) {
		        break;
		    }
		    System.out.println("X:" + line);
		}
	}
}
