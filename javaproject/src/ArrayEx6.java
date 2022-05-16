// 2 Dimentional array Matrix view
public class ArrayEx6 {

	public static void main(String[] args) {
		public String mirrorEnds(String string) {
			  int len = string.length();
			  String out = "";
			  String v1 = "";
			  String v2 = "";
			  
			  for (int i =0; i < len; i++) {
			    v1 += string.substring(i,i+1);
			    v2 ="";
			    for (int j =v1.length()-1; j>=0; j--) {
			      v2 +=v1.substring(j,j+1);
			      if (v2.equals(string.substring(len-i-1,len)))
			      out = v1;
			    }
			  }
			  return out;
	}

}
