// Method overloading

package AssistedProjects;

public class OverLoadMethod {

	public void area(int b, int h) {
		
		System.out.println("Area of Triangle is " + (0.5 * b * h));
	}

	public void area(int r) {
		System.out.println("Area of Circle is "+(3.14*r*r));
	}
	public static void main(String[] args) {
		OverLoadMethod ol = new OverLoadMethod();
		ol.area(10, 15);
		ol.area(5);
	}
}