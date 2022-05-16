// FileOutputStream to write into the txt file


package FileOutputStream;

import java.io.FileOutputStream;

public class FileOutputEx {

	public static void main(String[] args) {
		String s = "Hi Naveen How are u iam good here";
		byte[] data = s.getBytes();
		try {
			FileOutputStream f = new FileOutputStream("D://testing.txt");

			System.out.println("Writing into file");
			f.write(data);
			System.out.println("Printed");
		} catch (Exception e) {
			System.out.println(e);
			
		}

	}

}
