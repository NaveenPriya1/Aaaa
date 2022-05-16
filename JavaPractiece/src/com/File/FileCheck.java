// To check whether the file is there or not

package com.File;

import java.io.File;

public class FileCheck {

	public static void main(String[] args) {
		try{
			File f = new File("D://TestingFile.txt");
		
		System.out.println(f.exists());
	}catch(Exception e) {
		System.out.println(e);
	}

}
}