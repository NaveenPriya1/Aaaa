package com.File;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("a.txt");
		
		if (fos != null) {
			System.out.println("File created and opened in an out mode");
			
		}
		String s = "Hi How r u";
		byte b[] = s.getBytes();
		fos.write(b);
		System.out.println("Writing completed");
		fos.close();
		

	}

}
