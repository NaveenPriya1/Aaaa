package NumberPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

	public static void main(String[] args) {
		
		// 1st way
		Pattern p = Pattern.compile(".s");
		
		Matcher m = p.matcher("as");
		
		Boolean b = m.matches();
		
   // 2 nd way
		
		Boolean b2 = Pattern.compile(".s").matcher("as").matches();
		
		// 3rd way
		
		Boolean b3 = Pattern.matches(".s", "as");
		
		System.out.println(b+" "+b2+" "+b3 );
	}

}
