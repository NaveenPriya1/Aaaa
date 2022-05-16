// to read the length of the file

package com.File;

import java.io.File;

public class FileLength {

	public static void main(String[] args) {
		try{
			File f = new File("D://testing.txt");
		
		System.out.println(f.length());
	}catch(Exception e) {
		System.out.println(e);
	}

}
}