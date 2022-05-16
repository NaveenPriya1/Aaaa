// File class to create a file

package FileOutputStream;

import java.io.File;

public class FileClassEx {

	public static void main(String[] args) {
		File file = new File("D://Testing1.txt");
		try {
			file.createNewFile();
			
		} catch (Exception e) {
			
			System.out.println(e);
		}
		System.out.println("File Created");
		
	}

}
