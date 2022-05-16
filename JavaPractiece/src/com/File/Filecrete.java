// To create File

package com.File;

import java.io.File;
import java.io.IOException;

public class Filecrete {

	public static void main(String[] args) {
		File f = new File("D://TestingFile.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			
			System.out.println(e);
		}

	}

}
