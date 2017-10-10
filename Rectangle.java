/* To create a rectangle class with attributes length and width each set to default value =1
 *   
 *       Methods to calculate the rectangle's perimeter and area
 * 
 *       Set and get methods for both length and width and to check if the length and width values given are greater than 0.0 and less than 20.0
 *       
 * */

package PackCodeExercises;

public class Rectangle {
	private float length;       //instance variables declaration
	private float width;
	
	//constructor with length and width parameters and to check the values fall in the range
	
	public Rectangle(float length, float width){
		if(length<0.0||length>20.0){ 
			throw new IllegalArgumentException("lenght must me inbetween 0.0 and 20.0");
		}
		if(width<0.0||width>20.0){
			throw new IllegalArgumentException("width must be in between 0.0 and 20.0");
		}
		this.length= length;
		this.width = width;
		
	}
	
	//setting default length and width values in default constructor
	public Rectangle(){
		length=1;
		width =1;
	}

   //getters and setters for instance variables
	public float getLength() {
		return length;
	}

	void setLength(int length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	//method to calculate perimeter
	
	public float calculatePerimeter(float length, float width){
		float perimeter = (length*2)+((width)*2);
		return perimeter;
	}
	//method to calculate area
	
	public float area(float length,float width){
		float area = length * width;
		return area;
	}
	public float calculatePerimeter(){
		float perimeter = ((length)*2)+((this.width)*2);
		return perimeter;
	}
	
	public float area(){
		float area = length * width;
		return area;
	}


}
