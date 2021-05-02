import java.util.Scanner;

public class TestApplication {

	public static void main(String[] args) {
		Scanner userInput= new Scanner(System.in);
		System.out.println("What is the radius of the first circle?");
		double c1_Input=userInput.nextDouble();
		Circle c1= new Circle(c1_Input);
		double area1=c1.getArea();
		
		
		System.out.println("What is the radius of the second circle?");
		double c2_Input=userInput.nextDouble();
		Circle c2= new Circle(c2_Input);
		double area2=c2.getArea();
		
		System.out.println("What is the Length of the first Triangle?");
		double t1_Input=userInput.nextDouble();
		RightTriangle t1=new RightTriangle();
		t1.setLength(t1_Input);
		System.out.println("What is the Width of the first Triangle?");
		double t1_Inputs=userInput.nextDouble();
		t1.setWidth(t1_Inputs);
		double area3=t1.getArea();
		
		System.out.println("What is the Length of the second Triangle?");
		double t2_Input=userInput.nextDouble();
		RightTriangle t2=new RightTriangle();
		t2.setLength(t2_Input);
		System.out.println("What is the Width of the first Triangle?");
		double t2_Inputs=userInput.nextDouble();
		t2.setWidth(t2_Inputs);
		double area4=t2.getArea();
		
		
		System.out.println("The radius for the first circle is: "+c1.getRadius(c1_Input));
		System.out.println("The area for the first circle is: "+area1);
		System.out.println("The radius for the second circle is: "+c2.getRadius(c2_Input));
		System.out.println("The area for the second circle is: "+area2);
		
		System.out.println("The length of the first triangle is: "+t1.getLength());
		System.out.println("The width of the first triangle is: "+t1.getWidth());
		System.out.println("The hypotenuse of the first triangle is: "+t1.getHypotenuse());
		System.out.println("The Area of the first triangle is: "+area3);
		
		System.out.println("The length of the second triangle is: "+t2.getLength());
		System.out.println("The width of the second triangle is: "+t2.getWidth());
		System.out.println("The hypotenuse of the second triangle is: "+t2.getHypotenuse());
		System.out.println("The Area of the second triangle is: "+area4);
		
		if(area1==area2) {
			System.out.println("Both Circles have the same area");
		}else if(area1> area2) {
			System.out.println("Circle 1 has the largest area among the circles");
		}else {
			System.out.println("Circle 2 has the largest area among the circles");
		}
		
		if(area3==area4) {
			System.out.println("Both Triangles have the same area");
		}else if(area3> area4) {
			System.out.println("Triangle 1 has the largest area among the triangles");
		}else {
			System.out.println("Triangle 2 has the largest area among the triangles");
		}
		//System.out.println(c1.getRadius(radius));

	}

}
