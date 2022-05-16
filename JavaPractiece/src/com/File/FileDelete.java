// To delete file

package com.File;

import java.io.File;

public class FileDelete {

	public static void main(String[] args) {
		try {
			
		File f = new File("D://TestingFile.txt");
		f.delete();
		System.out.println(f.exists());
	}catch(Exception e) {
		System.out.println(e);
	}

}}

