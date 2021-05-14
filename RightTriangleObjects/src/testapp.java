import java.util.Scanner;

public class testapp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int answer;
		int choose;
		double scale;
		boolean exit = false;
		RightTriangle [] triangles = new RightTriangle[10];
		int id=0;
		boolean found = false;
		String prompt[]= {"","1-Enter a new right triangle","2-Delete a right triangle","3-Delete all right triangles","4-Display all right triangles","5-Move a triangle","6-Resize a triangle","7-Enter a scale factor","8-Scale all triangles","9-Exit program"};
		
		
		do {
			
			
			do {
				for(int i=1;i<=9;i++) {
					System.out.println(prompt[i]);
				}
				answer = input.nextInt();
				}
			while(answer < 1 || answer > 9);
				
			switch(answer) {
			  	case 1:
			  		
			  		found=false;
			  		for (int i = 1; i < triangles.length; i++)
					{
						// if this is an empty spot
						if (triangles[i] == null)
						{
							 triangles[i] = new RightTriangle();
							
							//sets user input to base value of triangle object
							System.out.println("What is the base?");
							double t1_Input=input.nextDouble();
							triangles[i].setBase(t1_Input);
							
							//sets user input to height value of triangle object
					  		System.out.println("What is the height?");
					  		double t2_Input=input.nextDouble();
							triangles[i].setHeight(t2_Input);
							
							//sets user input to X location value of triangle object
					  		System.out.println("What is the X Location?");
					  		int t3_Input=input.nextInt();
							triangles[i].setxLoc(t3_Input);
							
							//sets user input to Y Location value of triangle object
					  		System.out.println("What is the y Location?");
					  		int t4_Input=input.nextInt();
							triangles[i].setyLoc(t4_Input);
							
							// this sets the id then increments it so that the next id used is different
							id+=1;
							triangles[i].setID(id);
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
				case 2:
					found=false;
					System.out.println("Enter the ID of the triangle you want to delete");
					choose=input.nextInt();
					if(triangles[choose]!=null) {
						found=true;
					}
					triangles[choose]=null;
					
					if(found==false) {
						System.out.println("There are no triangles with that ID");					}
				    break;
				case 3:
					found=false;
					for (int i = 1; i < triangles.length; i++)
					{
						// if this is a valid object and the correct object
						if (triangles[i] != null )
						{
							// delete object
							triangles[i] = null;

							// set found to true
							found=true;
							
						}
					}
					if(found==false) {
						System.out.println("No triangles were found");
					}
				   
				    break;
				case 4:
					found=false;
					for (int i = 1; i < triangles.length; i++)
					{
						// if this is a valid object and the correct object
						if (triangles[i] != null)
						{
							System.out.println("The ID for triangle "+i+" is:"+triangles[i].getID());
							System.out.println("The base for triangle "+i+" is:"+triangles[i].getBase());
							System.out.println("The height for triangle "+i+" is:"+triangles[i].getHeight());
							System.out.println("The hypotenuse for triangle "+i+" is:"+triangles[i].getHypotenuse());
							System.out.println("The X Location for triangle "+i+" is:"+triangles[i].getxLoc());
							System.out.println("The Y Location for triangle "+i+" is:"+triangles[i].getyLoc());
							System.out.println("The area for triangle "+i+" is:"+triangles[i].getArea());
							System.out.println("The perimeter for triangle "+i+" is:"+triangles[i].getPerimeter());
							System.out.println(" ");
							
							found=true;
					
						}
					}
					if(found==false) {
						System.out.println("Sorry no triangles were found");
					}
				    break;
				case 5:
					found=false;
					System.out.println("Enter the ID of the triangle you want to move");
					choose=input.nextInt();
					if(triangles[choose]!=null) {
						found=true;
					}
					if(found==false) {
						System.out.println("There are no triangles with that ID");
						break;
					}
					System.out.println("What is the X Location?");
			  		int t3_Input=input.nextInt();
					triangles[choose].setxLoc(t3_Input);
					
					//sets user input to Y Location value of triangle object
			  		System.out.println("What is the y Location?");
			  		int t4_Input=input.nextInt();
					triangles[choose].setyLoc(t4_Input);
					
				    break;
				case 6:
					found=false;
					System.out.println("Enter the ID of the triangle you want to resize");
					choose=input.nextInt();
					if(triangles[choose]!=null) {
						found=true;
					}
					if(found==false) {
						System.out.println("There are no triangles with that ID");
						break;
					}
					//sets user input to base value of triangle object
					System.out.println("What is the base?");
					double t1_Input=input.nextDouble();
					triangles[choose].setBase(t1_Input);
					
					//sets user input to height value of triangle object
			  		System.out.println("What is the height?");
			  		double t2_Input=input.nextDouble();
					triangles[choose].setHeight(t2_Input);
				    break;
				case 7:
				    System.out.println("What is the new scale you want to set?");
				    scale=input.nextDouble();
				    RightTriangle.setScaleFactor(scale);
				    break;
				case 8:
					for (int i = 1; i < triangles.length; i++)
					{
						// if this is a valid object and the correct object
						if (triangles[i] != null )
						{
							triangles[i].ScaleShape();
							// break out of loop
							break;
						}
					}
					break;  
				case 9:
					System.out.println("Thank you! Have a nice day");
					exit=true;
					break;
			}
		}while(!exit);
		
		
		
		}
}
