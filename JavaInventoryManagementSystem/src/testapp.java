import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class testapp {
	public static void main(String[] args) throws FileNotFoundException {
		boolean again=false;
		boolean found = false;
		int id=0;
		Item [] items = new Item[100];
		Item [] cart = new Item[100];
		// code for loading file into the array
		
	//	System.out.println(input.nextLine());
Scanner keyboard = new Scanner(System.in);

		
		File input = new File("./data/temp.txt");
		Scanner inputFile = new Scanner(input);
		int n = 0;
		String line;
		while(inputFile.hasNext()){
		
			line = inputFile.nextLine();
		    //System.out.println(line);
		    
		    ArrayList<String> temp = new ArrayList<>(Arrays.asList(line.split(",")));
		    //1,name,100,10.25 //format
		    int ID = Integer.parseInt(temp.get(0));
		    String Name = temp.get(1);
		    int Quantity = Integer.parseInt(temp.get(2));
		    double Price = Double.parseDouble(temp.get(3));
		    
		    Item newitem = new Item(ID, Name, Quantity, Price);
		    items[n] = newitem;
		    n++;
		    
		}
		int largest = 0;
		for(int i = 0 ; i < n; i++) {
			int tempid = items[i].getID();
			if(tempid > largest) {
				largest = tempid;
			}
		}
		int id2=largest;

		inputFile.close();
			
do {
		
		Scanner UserInput= new Scanner (System.in);
		System.out.println("Main Menu:");
		System.out.println("1) Admin");
		System.out.println("2) User");
		System.out.println("3) Exit");
		int answer1 = UserInput.nextInt();
		switch(answer1) {
		case 1:
			boolean some= false;
			do {
			System.out.println("Admin Menu:");
			System.out.println("1) Add new item");
			System.out.println("2) Search and Update Item");
			System.out.println("3) Search and delete");
			System.out.println("4) Exit Admin Menu");
			int answer2 = UserInput.nextInt();
			
				switch(answer2) {
				
				case 1:
					// code for adding new item
					found=false;
					id=0;
						for (int i = 0; i < items.length; i++)
					{
						id+=1;
						// if this is an empty spot
						if (items[i] == null)
						{
							items[i] = new Item();
							//sets name for the object
							System.out.println("What is the Name?");
							String t1_Input=UserInput.next();
							items[i].setName(t1_Input);
							
							
							//sets quantity for the object
							System.out.println("What is the Quantity?");
							int t2_Input=UserInput.nextInt();
							items[i].setQuantity(t2_Input);
							
							System.out.println("What is the Price?");
							double t3_Input=UserInput.nextDouble();
							items[i].setPrice(t3_Input);
							// this sets the id then increments it so that the next id used is different
							//id+=1;
							items[i].setID(id);
							
							// set found to true
							found = true;
							System.out.println("Your item has been created");
							System.out.println("Id: "+items[i].getID());
							System.out.println("Name: "+items[i].getName());
							System.out.println("Price: "+items[i].getPrice());
							System.out.println("Quantity: "+items[i].getQuantity());
								// break out of loop
							break;
						}
						
					}
						if(found==false) {
							System.out.println("Sorry. There are no more slots available to add a new item");
						}
				    break;
				    
				case 2:
					// code for searching for item
					int matches=0;
					System.out.println("Enter the Name of the item you want to edit");
					String choose1=UserInput.next();
					// this part checks how many matches there are
					for (int i = 0; i < items.length; i++) {
						try {
							if((items[i].getName()).contains(choose1)) {
								matches+=1;
								
							}
						}catch(NullPointerException e) {
							
						}
							
					}
					// if there are multiple matches
					if(matches>1) {
						System.out.println("There are "+matches+" number of matches found");
						for (int i = 0; i < items.length; i++) {
							try {
								if((items[i].getName()).contains(choose1)) {
									
									System.out.println("option number: "+items[i].getID()+" Name: "+items[i].getName());
								}
							}catch(NullPointerException e) {
								
							}
								
						}
						// code for updating item
						System.out.println("Enter the option number of the item you want to change");
						int t=UserInput.nextInt();
						for (int i = 0; i < items.length; i++) {
							if(items[i]!=null&&items[i].getID()==t) {
									//code for deleting the item
									System.out.println("What do you want to set the Name to?");
							  		String t4_Input=UserInput.next();
							  		items[i].setName(t4_Input);
									
									
							  		System.out.println("What is the Quantity of this Item?");
							  		int t5_Input=UserInput.nextInt();
							  		items[i].setQuantity(t5_Input);
									
							  		System.out.println("What is the Price of this Item?");
							  		double t6_Input=UserInput.nextDouble();
							  		items[i].setPrice(t6_Input);
							  		
							  		System.out.println("Your item has been changed");
									System.out.println("Id: "+items[i].getID());
									System.out.println("Name: "+items[i].getName());
									System.out.println("Price: "+items[i].getPrice());
									System.out.println("Quantity: "+items[i].getQuantity());
								
							}
						}
						
					}
					// if there is only one match
					else if(matches==1) {
						for (int i = 0; i < items.length; i++) {
							try {
								if((items[i].getName()).contains(choose1)) {
									// code for updating item
									System.out.println("What do you want to set the Name to?");
							  		String t4_Input=UserInput.next();
							  		items[i].setName(t4_Input);
									
									
							  		System.out.println("What is the Quantity of this Item?");
							  		int t5_Input=UserInput.nextInt();
							  		items[i].setQuantity(t5_Input);
									
							  		System.out.println("What is the Price of this Item?");
							  		double t6_Input=UserInput.nextDouble();
							  		items[i].setPrice(t6_Input);
							  		
							  		System.out.println("Your item has been changed");
									System.out.println("Id: "+items[i].getID());
									System.out.println("Name: "+items[i].getName());
									System.out.println("Price: "+items[i].getPrice());
									System.out.println("Quantity: "+items[i].getQuantity());
								}
							}catch(NullPointerException e) {
								
							}
								
						}
						
					}
					else{
						System.out.println("There are no items with that name");
					}
					
					
					
				    break;
				case 3:
					int match=0;
					// code for searching and deleting new item
					found=false;
					System.out.println("Enter the name of the item you want to delete");
					String choose2=UserInput.next();
					for (int i = 0; i < items.length; i++) {
						try {
							if((items[i].getName()).contains(choose2)) {
								match+=1;
								
								}
						}catch(NullPointerException e) {
							
						}
						
					}
					if(match>1) {
						System.out.println("There are "+match+" number of matches found");
						for (int i = 0; i < items.length; i++) {
							try {
								if((items[i].getName()).contains(choose2)) {
									System.out.println("option number: "+items[i].getID()+" Name: "+items[i].getName());
									
									}
							}catch(NullPointerException e) {
								
							}
							
						}
						//code for selecting the item
						System.out.println("Enter the option number of the item you want to delete");
						int t=UserInput.nextInt();
						for (int i = 0; i < items.length; i++) {
							if(items[i]!=null&&items[i].getID()==t) {
								
									//code for deleting the item
									items[i]=null;
									System.out.println("Your item has been deleted");
								
							}
						}
					
						
					}else if(match==1) {
						for (int i = 0; i < items.length; i++) {
							try {
								if((items[i].getName()).contains(choose2)) {
									//code for deleting the item
									items[i]=null;
									System.out.println("Your item has been deleted");
									
									}
							}catch(NullPointerException e) {
								
							}
							
						}
						
					}else {
						System.out.println("There are no items with that name");
					}
				    break;
				case 4:
					System.out.println("Are you sure you want to exit?");
					String answer4=UserInput.next();
					if(answer4.equals("y")||answer4.equals("Y")||answer4.equals("yes")||answer4.equals("Yes")) {
						some=true;
						break;
					}else {
						some=false;
						break;
					}
				default:
						System.out.println("Please choose a number between 1 and 4");
						some=false;
						break;
				}
				PrintWriter outputFile = new PrintWriter("./data/temp.txt");
				
				
				for(int i = 0; i < items.length; i++) {
					
					if(items[i] != null) {
					
						String tempLine = "";
					
						tempLine += items[i].getID() + ",";
						tempLine += items[i].getName() +",";
						tempLine += items[i].getQuantity() + ",";
						tempLine += items[i].getPrice();
						outputFile.println(tempLine);
					
					}
					
				}
				outputFile.close();
				
			}while(some==false);
			break;
		case 2:
			boolean some2=false;
			do {
				System.out.println("User Menu:");
				System.out.println("1) Search item");
				System.out.println("2) Shopping cart/Checkout");
				System.out.println("3) Exit User Menu");
				int answer3 = UserInput.nextInt();
				switch(answer3) {
				case 1:
					// code for searching for item
					int matches=0;
					System.out.println("Enter the Name of the item you are looking for");
					String choose1=UserInput.next();
					// this part checks how many matches there are
					for (int i = 0; i < items.length; i++) {
						try {
							if((items[i].getName()).contains(choose1)) {
								matches+=1;
								
							}
						}catch(NullPointerException e) {
							
						}
							
					}
					// if there are multiple matches
					
					if(matches>1) {
						System.out.println("There are "+matches+" number of matches found");
						for (int i = 0; i < items.length; i++) {
							try {
								if((items[i].getName()).contains(choose1)) {
									System.out.println("option number: "+items[i].getID()+" Name: "+items[i].getName()+" Quantity: "+items[i].getQuantity()+" Price: "+items[i].getPrice());
								}
							}catch(NullPointerException e) {
								
							}
								
						}
						// code for adding item to shopping cart
						System.out.println("Enter the option number of the item you want");
						int t=UserInput.nextInt();
						
					
						System.out.println("Do you want to add this item to the cart?");
						String answer5=UserInput.next();
						if(answer5.equals("y")||answer5.equals("Y")||answer5.equals("yes")||answer5.equals("Yes")) {
							some2=true;
							boolean quan=false;
							do {
								System.out.println("How many would you like?");
								int num=UserInput.nextInt();
								for (int i = 0; i < items.length; i++) {
									if(items[i]!=null&&items[i].getID()==t) {
											//code for deleting the item
											if(num>items[i].getQuantity()) {
												System.out.println("We do not have that many available");
												System.out.println("We only have "+items[i].getQuantity()+" available");
												quan=false;
											}else {
												
												cart[i] = new Item();
													cart[i].setID(items[i].getID());
													(cart[i]).setName(items[i].getName());
													(cart[i]).setQuantity(num);
													(cart[i]).setPrice(items[i].getPrice());
												
												
												
												
												System.out.println("Your item has been added to your cart");
												System.out.println("Id: "+cart[i].getID());
												System.out.println("Name: "+cart[i].getName());
												System.out.println("Price: "+cart[i].getPrice());
												System.out.println("Quantity: "+cart[i].getQuantity());
												quan=true;
												some2=false;
										}
									
								}
								
								}
							}while(quan==false);
						}else {
							some2=false;
							break;
						}
							
						
					}
					// if there is only one match
					else if(matches==1) {
						for (int i = 0; i < items.length; i++) {
							try {
								if((items[i].getName()).contains(choose1)) {
									System.out.println("There is only one item with that name");
									System.out.println("Name: "+items[i].getName()+" Quantity: "+items[i].getQuantity()+" Price: "+items[i].getPrice());

									// code for adding item to shopping cart
									System.out.println("Do you want to add this item to the cart?");
									String answer6=UserInput.next();
									if(answer6.equals("y")||answer6.equals("Y")||answer6.equals("yes")||answer6.equals("Yes")) {
										some2=true;
										boolean quan=false;
										do {
											System.out.println("How many would you like?");
											int num=UserInput.nextInt();
											
											if(num>items[i].getQuantity()) {
												System.out.println("We do not have that many available");
												System.out.println("We only have "+items[i].getQuantity()+" available");
												quan=false;
											}else {
												
												cart[i] = new Item();
													cart[i].setID(items[i].getID());
													(cart[i]).setName(items[i].getName());
													(cart[i]).setQuantity(num);
													(cart[i]).setPrice(items[i].getPrice());
													System.out.println("Your item has been added to your cart");
													System.out.println("Id: "+cart[i].getID());
													System.out.println("Name: "+cart[i].getName());
													System.out.println("Price: "+cart[i].getPrice());
													System.out.println("Quantity: "+cart[i].getQuantity());
												quan=true;
												some2=false;
											}
										}while(quan==false);	
									}	
									else {
										some2=false;
										break;
									}
								}
							}catch(NullPointerException e) {
								
							}
								
						}
						
					}
					else{
						System.out.println("There are no items with that name");
					}
					
					
					
				    break;
					
				case 2:
					double subtotal=0;
					some2=false;
					int count=0;
					boolean some3=false;
					
					// code for checking out using shopping cart
					System.out.println("Cart:");
					for (int i = 0; i < cart.length; i++) {
							if(cart[i]!=null){
								System.out.println("Item Name: "+cart[i].getName()+" Amount: "+cart[i].getQuantity()+" Price: "+cart[i].getPrice());
								count+=1;
								subtotal+=(cart[i].getQuantity()*cart[i].getPrice());
							}
					}
					if(count==0) {
						System.out.println("Your cart is empty");
					}
					System.out.println("Your Subtotal is: "+subtotal);
					do {
					System.out.println("Cart Menu:");
					System.out.println("1) Delete Item from cart");
					System.out.println("2) Empty Cart");
					System.out.println("3) Checkout");
					System.out.println("4) Exit Cart Menu");
					
					int answer4 = UserInput.nextInt();
					
					switch(answer4) {
						case 1:
							int match=0;
							if(count==0) {
								System.out.println("Your cart is empty");
								some3=true;
								break;
							}else {
								// code for searching and deleting new item
								found=false;
								System.out.println("Enter the name of the item you want to delete");
								String choose3=UserInput.next();
								for (int i = 0; i < cart.length; i++) {
									try {
										if((cart[i].getName()).contains(choose3)) {
											match+=1;
											
											}
									}catch(NullPointerException e) {
										
									}
									
								}
								if(match>1) {
									System.out.println("There are "+match+" number of matches found");
									for (int i = 0; i < items.length; i++) {
										try {
											if((cart[i].getName()).contains(choose3)) {
												System.out.println("option number: "+cart[i].getID()+" Name: "+cart[i].getName());
												
												}
										}catch(NullPointerException e) {
											
										}
										
									}
									//code for selecting the item
									System.out.println("Enter the option number of the item you want to delete");
									int t=UserInput.nextInt();
									for (int i = 0; i < items.length; i++) {
										if(items[i]!=null&&items[i].getID()==t) {
												//code for deleting the item
												cart[t]=null;
												System.out.println("Your item has been deleted");
											
										}
									}
									
								}else if(match==1) {
									for (int i = 0; i < cart.length; i++) {
										try {
											if((cart[i].getName()).contains(choose3)) {
												//code for deleting the item
												cart[i]=null;
												System.out.println("Your item has been deleted");
												
												}
										}catch(NullPointerException e) {
											
										}
										
									}
									
								}else {
									System.out.println("There are no items with that name");
								}
							    break;
							}
						case 2:
							some3=false;
							// code for exiting user menu
							if(count==0) {
								System.out.println("Your cart is empty");
								some3=true;
								break;
							}else {
								System.out.println("Are you sure you want to empty your cart?");
								String answer6=UserInput.next();
								if(answer6.equals("y")||answer6.equals("Y")||answer6.equals("yes")||answer6.equals("Yes")) {
									System.out.println("Your cart has been emptied");
									for (int i = 0; i < cart.length; i++) {
										cart[i]=null;
									}
									some3=true;
									break;
								}else {
									some3=true;
									break;
								}
							}
						
						case 3:
							double total=0;
							some3=false;
							if(count==0) {
								System.out.println("Your cart is empty");
								some3=true;
								break;
							}else {
								total=((subtotal*0.07)+subtotal);
								System.out.println("Your total is: "+total);
								System.out.println("Would you like to check out these items?");
								String answer5=UserInput.next();
								if(answer5.equals("y")||answer5.equals("Y")||answer5.equals("yes")||answer5.equals("Yes")) {
									System.out.println("Thank you for shopping here! Have a nice day");
									for (int i = 0; i < cart.length; i++) {
										if(cart[i]!=null){
											items[i].setQuantity(items[i].getQuantity()-cart[i].getQuantity());
											cart[i]=null;
										}
								}
									some3=true;
									break;
								}else {
									some3=true;
									break;
								}
						
							}
						
						case 4:
							some3=false;
							// code for exiting user menu
							System.out.println("Are you sure you want to exit?");
							String answer7=UserInput.next();
							if(answer7.equals("y")||answer7.equals("Y")||answer7.equals("yes")||answer7.equals("Yes")) {
								some3=true;
								break;
							}else {
								some3=false;
								break;
							}
						default:
							System.out.println("Please choose a number between 1 and 4");
							some3=false;
							break;
						}
						PrintWriter outputFile = new PrintWriter("./data/temp.txt");
						
						
						for(int i = 0; i < items.length; i++) {
							
							if(items[i] != null) {
							
								String tempLine = "";
							
								tempLine += items[i].getID() + ",";
								tempLine += items[i].getName() +",";
								tempLine += items[i].getQuantity() + ",";
								tempLine += items[i].getPrice();
								outputFile.println(tempLine);
							
							}
							
						}
						outputFile.close();
					}while(some3==false);
					break;	
				case 3:
					some2=false;
					// code for exiting user menu
					System.out.println("Are you sure you want to exit?");
					String answer6=UserInput.next();
					if(answer6.equals("y")||answer6.equals("Y")||answer6.equals("yes")||answer6.equals("Yes")) {
						some2=true;
						break;
					}else {
						some2=false;
						break;
					}
				default:
					System.out.println("Please choose a number between 1 and 3");
					some2=false;
					break;
				}
				
			}while(some2==false);
			break;
		case 3:
			System.out.println("Are you sure you want to exit?");
			String answer5=UserInput.next();
			if(answer5.equals("y")||answer5.equals("Y")||answer5.equals("yes")||answer5.equals("Yes")) {
				System.out.println("Thank you! Have a nice day");
				again=true;
				break;
			}else {
				again=false;
				break;
			}
		default:
				System.out.println("Please choose a number between 1 and 3");
				again=false;
				break;
		}
	}while(!again);
	
}
}
