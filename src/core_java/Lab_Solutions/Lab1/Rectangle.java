package core_java.Lab_Solutions.Lab1;

public class Rectangle {
	
	int length = 20;
	int breadth = 25;

	public static void main(String[] args) {
			
		   int areaOfRectangle =  area(20, 25);  
		   int perimeterOfRectangle = perimeter(20,25);
		   System.out.println("Area of rectangle: "+areaOfRectangle);
		   System.out.println("Perimeter of rectangle: "+perimeterOfRectangle);
	}
	
	public static int area(int length, int breadth) {
		int Length = length;
		int Breadth = breadth;
		return Length*Breadth;
		
	}
	public static int perimeter(int length, int breadth) {
		int Length = length;
		int Breadth = breadth;
		return 2*(Length+Breadth);
		
	}

}
