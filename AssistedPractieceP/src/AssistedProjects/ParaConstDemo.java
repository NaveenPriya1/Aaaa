// Parameterized constructor

package AssistedProjects;

class Std{
	int id;
	String name;
	
	public Std(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void display() {
		System.out.println(id+" "+name);
	}
}


public class ParaConstDemo {

	public static void main(String[] args) {
		Std student = new Std(123, "Naveen");
		Std student1 = new Std(22, "Swagath");
		
		student.display();
		student1.display();

	}

}
