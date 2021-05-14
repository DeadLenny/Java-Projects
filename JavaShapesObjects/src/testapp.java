import java.util.Scanner;

public class testapp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int answer;
		int choose;
		double scale=1;
		boolean exit = false;
		shapes [] Shapes = new shapes[10];
		int id=0;
		boolean found = false;
		String prompt[]= {"","1-Add a new circle","2-Add a new rectangle","3-Add a new right triangle","4-Delete a shape","5-Delete all shape","6-Display all shapes","7-Move a shape","8-Enter a scale factor","9-Scale all shapes","10-Exit Program"};
		
		
		do {
			
			
			do {
				for(int i=1;i<=10;i++) {
					System.out.println(prompt[i]);
				}
				answer = input.nextInt();
				}
			while(answer < 1 || answer > 10);
				
			switch(answer) {
					case 1:
						found=false;
				  		for (int i = 1; i < Shapes.length; i++)
						{
							// if this is an empty spot
							if (Shapes[i] == null)
							{
								 
								//sets user input to base value of circle object
								System.out.println("What is the radius?");
								double t1_Input=input.nextDouble();
								Shapes[i] = new circle(i, i, i, scale,t1_Input);
								
								//sets user input to X location value of circle object
						  		System.out.println("What is the X Location?");
						  		int t3_Input=input.nextInt();
								Shapes[i].setxLoc(t3_Input);
								
								//sets user input to Y Location value of circle object
						  		System.out.println("What is the y Location?");
						  		int t4_Input=input.nextInt();
								Shapes[i].setyLoc(t4_Input);
								
								// this sets the id then increments it so that the next id used is different
								id+=1;
								Shapes[i].setID(id);
								
								// set found to true
								found = true;
								
								
								System.out.println("Your circle has been created");
		
								// break out of loop
								break;
							}
							
						}
				  		
				  		
				  		if(found==false) {
				  			System.out.println("Sorry. There are no more slots available to create a new circle");
				  		}
					    
					    break;
					case 2:
						found=false;
				  		for (int i = 1; i < Shapes.length; i++)
						{
							// if this is an empty spot
							if (Shapes[i] == null)
							{
								 
								//sets user input to base value of rectangle object
								System.out.println("What is the Length?");
								double t1_Input=input.nextDouble();
								
								
								
								//sets user input to height value of rectangle object
						  		System.out.println("What is the Width?");
						  		double t2_Input=input.nextDouble();
								
								
								Shapes[i] = new rectangle(i, i, i, scale,t1_Input,t2_Input);
								
								//sets user input to X location value of rectangle object
						  		System.out.println("What is the X Location?");
						  		int t3_Input=input.nextInt();
								Shapes[i].setxLoc(t3_Input);
								
								//sets user input to Y Location value of rectangle object
						  		System.out.println("What is the y Location?");
						  		int t4_Input=input.nextInt();
								Shapes[i].setyLoc(t4_Input);
								
								// this sets the id then increments it so that the next id used is different
								id+=1;
								Shapes[i].setID(id);
								
								// set found to true
								found = true;
								
								
								System.out.println("Your Rectangle has been created");
	
								// break out of loop
								break;
							}
							
						}
				  		
				  		
				  		if(found==false) {
				  			System.out.println("Sorry. There are no more slots available to create a new rectangle");
				  		}
					    
					    break;
			  	case 3:
			  		
			  		found=false;
			  		for (int i = 1; i < Shapes.length; i++)
					{
						// if this is an empty spot
						if (Shapes[i] == null)
						{
							 
							//sets user input to base value of triangle object
							System.out.println("What is the base?");
							double t1_Input=input.nextDouble();
							
							
							
							//sets user input to height value of triangle object
					  		System.out.println("What is the height?");
					  		double t2_Input=input.nextDouble();
							
							
							Shapes[i] = new rightTriangle(i, i, i, scale,t1_Input,t2_Input);
							
							//sets user input to X location value of triangle object
					  		System.out.println("What is the X Location?");
					  		int t3_Input=input.nextInt();
							Shapes[i].setxLoc(t3_Input);
							
							//sets user input to Y Location value of triangle object
					  		System.out.println("What is the y Location?");
					  		int t4_Input=input.nextInt();
							Shapes[i].setyLoc(t4_Input);
							
							// this sets the id then increments it so that the next id used is different
							id+=1;
							Shapes[i].setID(id);
						
							// set found to true
							found = true;
							
							
							System.out.println("Your Triangle has been created");

							// break out of loop
							break;
						}
						
					}
			  		
			  		
			  		if(found==false) {
			  			System.out.println("Sorry. There are no more slots available to create a new triangle");
			  		}
				    
				    break;
				
				
				case 4:
					found=false;
					System.out.println("Enter the ID of the shape you want to delete");
					choose=input.nextInt();
					if(Shapes[choose]!=null) {
						found=true;
					}
					Shapes[choose]=null;
					
					if(found==false) {
						System.out.println("There are no shapes with that ID");					}
				    break;
				case 5:
					found=false;
					for (int i = 1; i < Shapes.length; i++)
					{
						// if this is a valid object and the correct object
						if (Shapes[i] != null )
						{
							// delete object
							Shapes[i] = null;

							// set found to true
							found=true;
							
						}
					}
					if(found==false) {
						System.out.println("No Shapes were found");
					}
				   
				    break;
				case 6:
					found=false;
					for (int i = 1; i < Shapes.length; i++)
					{
						// if this is a valid object and the correct object
						if (Shapes[i] != null)
						{
							   
							if(Shapes[i] instanceof rightTriangle) {
								rightTriangle r=(rightTriangle)Shapes[i];
								System.out.println("The ID for the triangle is:"+r.getID());
								System.out.println("The base for the triangle is:"+r.getBase());
								System.out.println("The height for the triangle is:"+r.getHeight());
								System.out.println("The hypotenuse for the triangle is:"+r.getHypotenuse());
								System.out.println("The X Location for the triangle is:"+r.getxLoc());
								System.out.println("The Y Location for the triangle is:"+r.getyLoc());
								System.out.println("The area for the triangle is:"+r.getArea());
								System.out.println("The perimeter for the triangle is:"+r.getPerimeter());
								System.out.println(" ");
								
								found=true;
							}else if (Shapes[i] instanceof rectangle) {
								rectangle j=(rectangle)Shapes[i];
								System.out.println("The ID for the rectangle is:"+j.getID());
								System.out.println("The width for the rectangle is:"+j.getWidth());
								System.out.println("The length for the rectangle is:"+j.getLength());
								System.out.println("The X Location for the rectangle is:"+j.getxLoc());
								System.out.println("The Y Location for the rectangle is:"+j.getyLoc());
								System.out.println("The area for the rectangle is:"+j.getArea());
								System.out.println("The perimeter for the rectangle is:"+j.getPerimeter());
								System.out.println(" ");
								
								found=true;
							}else if(Shapes[i] instanceof circle) {
								circle c=(circle)Shapes[i];
								System.out.println("The ID for the circle is:"+c.getID());
								System.out.println("The radius for the circle is:"+c.getRadius());
								System.out.println("The X Location for the circle is:"+c.getxLoc());
								System.out.println("The Y Location for the circle is:"+c.getyLoc());
								System.out.println("The area for the circle is:"+c.getArea());
								System.out.println("The perimeter for the circle is:"+c.getPerimeter());
								System.out.println(" ");
								
								found=true;	
							}
							
							
					
						}
					}
					if(found==false) {
						System.out.println("Sorry no shapes were found");
					}
				    break;
				case 7:
					found=false;
					System.out.println("Enter the ID of the Shape you want to move");
					choose=input.nextInt();
					if(Shapes[choose]!=null) {
						found=true;
					}
					if(found==false) {
						System.out.println("There are no Shape with that ID");
						break;
					}
					System.out.println("What is the X Location?");
			  		int t3_Input=input.nextInt();
			  		Shapes[choose].setxLoc(t3_Input);
					
					//sets user input to Y Location value of triangle object
			  		System.out.println("What is the y Location?");
			  		int t4_Input=input.nextInt();
			  		Shapes[choose].setyLoc(t4_Input);
					
				    
				    break;
				case 8:
					System.out.println("What is the new scale you want to set?");
				    scale=input.nextDouble();
				    shapes.setScaleFactor(scale);
				    break;
				case 9:
					for (int i = 1; i < Shapes.length; i++)
					{
						// if this is a valid object and the correct object
						if (Shapes[i] != null )
						{
							if(Shapes[i] instanceof rightTriangle) {
								rightTriangle r=(rightTriangle)Shapes[i];
								r.ScaleShape();
							}else if (Shapes[i] instanceof rectangle) {
								rectangle j=(rectangle)Shapes[i];
								j.ScaleShape();
							}else if(Shapes[i] instanceof circle) {
								circle c=(circle)Shapes[i];
								c.ScaleShape();
							}
						}
					}
					break; 
					
				case 10:
					System.out.println("Are you sure you want to exit?");
					String answer1=input.next();
					if(answer1.equals("y")||answer1.equals("Y")||answer1.equals("yes")||answer1.equals("Yes")) {
						System.out.println("Thank you! Have a nice day");
						exit=true;
						break;
					}else {
						exit=false;
						break;
					}
					
					
			}
		}while(!exit);
		

	}

}
