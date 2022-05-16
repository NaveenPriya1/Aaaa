// Array of Objects


public class Student {
	int sid;
	String sname;

	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Student sid=" + sid + ", sname=" + sname;
	}

	 class ArrayEx {
		public static void main(String[] args) {

			Student s1 = new Student(1, "Naveen");
			Student s2 = new Student(6, "Suresh");
			Student s3 = new Student(12, "Sravan");
			Student s[] = new Student[3];
			s[0] = s1;
			s[1] = s2;
			s[2] = s3;
			
			for(Student x:s) {
				System.out.println(x);
			}
			
		}

	}}

