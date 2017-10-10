/* Test class to test the class Rectangle */

package PackCodeExercises;

public class RectangleTest {

	public static void main(String[] args) {
	

		
		System.out.println("Calculating the area of rectangle");
		Rectangle r = new Rectangle((float)3.234561, 2);

		System.out.printf("The perimeter and area of  of the rectangle is:"+
				r.calculatePerimeter()+" "+r.area());

	}

}
