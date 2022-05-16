// To create Folder

package com.File;

import java.io.File;

public class FileFolder {

	public static void main(String[] args) {
		File f = new File("D://Testing2");
		try{
			f.mkdir();
		//f.delete(); to delete
		}catch(Exception e)	{
			System.out.println(e);
		}
		
	}

}
