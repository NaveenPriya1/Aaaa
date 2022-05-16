//FileReader to read the file content

package com.File;

import java.io.FileReader;

public class FileReader1 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("D://testing.txt");
			for (int i = 0;i<33;i++) {
				System.out.print((char)fr.read());
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
