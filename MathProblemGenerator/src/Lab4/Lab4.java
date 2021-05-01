package Lab4;
import java.util.Random;
import java.util.Scanner;
public class Lab4 {
	 
	public static void main(String[] args) {
		int Level;
		int Type;
		int num1 = 0;
		int num2=0;
		int num3=0;
		int ComputerAns=0;
		int UserAns = 0;
		int numCorrect=0;
		int Choice=0;
		String goodInput = null;
		String badInput = null;
		Scanner userInput= new Scanner(System.in);
		Random randNum = new Random(); 
		//This part starts the program and runs it again if needed
		do {
				// This part makes sure that the level chosen is between 1 and 3
				 do {
					 System.out.println("Choose a level");
				 Level=userInput.nextInt();
				 }
				 while (Level <1||Level >3); 
			
				 
				 //This part makes sure that the type chosen is between 1 and 4
				 do {
					System.out.println("Choose a type");
					System.out.println("Type 1 is Addition");
					System.out.println("Type 2 is Average");
					System.out.println("Type 3 is finding the largest number");
					System.out.println("Type 4 is finding the smallest number");
				 Type=userInput.nextInt(); 
				 }
				 while(Type<1||Type >4);
				 
				 for(int i=0;i<10;i++) {
						//This part assigns random number to the three variables based on level chosen
						 switch(Level) {
						 case 1:
							 num1=randNum.nextInt(10);
							 num2=randNum.nextInt(10);
							 num3=randNum.nextInt(10);
							 if(num1==num2 || num1==num3) {
								 num1=randNum.nextInt(10);
							 }
							 if(num2==num1 || num2==num3) {
								 num2=randNum.nextInt(10);
							 }
							 if(num3==num1 || num3==num2) {
								 num3=randNum.nextInt(10);
							 }
							 break;
						 case 2:
							 num1=randNum.nextInt(100);
							 num2=randNum.nextInt(100);
							 num3=randNum.nextInt(100);
							 if(num1==num2 || num1==num3) {
								 num1=randNum.nextInt(100);
							 }
							 if(num2==num1 || num2==num3) {
								 num2=randNum.nextInt(100);
							 }
							 if(num3==num1 || num3==num2) {
								 num3=randNum.nextInt(100);
							 }
							 break;
						 case 3:
							 num1=randNum.nextInt(1000);
							 num2=randNum.nextInt(1000);
							 num3=randNum.nextInt(1000);
							 if(num1==num2 || num1==num3) {
								 num1=randNum.nextInt(1000);
							 }
							 if(num2==num1 || num2==num3) {
								 num2=randNum.nextInt(1000);
							 }
							 if(num3==num1 || num3==num2) {
								 num3=randNum.nextInt(1000);
							 }
							 break;
						 }
						 
						 
						 //This part creates the problem based on the level and type selected
						 switch(Type) {
						 case 1:
							 ComputerAns=num1+num2+num3;
							 System.out.println("Add these numbers: "+ num1 +" "+ num2 +" "+ num3);
							 UserAns=userInput.nextInt();
							 break;
						 case 2:
							 ComputerAns=((num1+num2+num3)/3);
							 System.out.println("Average these numbers: "+ num1 +" "+ num2 +" "+ num3);
							 UserAns=userInput.nextInt();
							 break;
						 case 3:
							 if(num1>num2 && num1>num3) {
								 ComputerAns=num1;
							 }else if(num2>num1 && num2>num3){
								ComputerAns=num2;
							 }else {
								 ComputerAns=num3;
							 }
							 System.out.println("Choose the Biggest number form these numbers: "+ num1 +" "+ num2 +" "+ num3);
							 UserAns=userInput.nextInt();
						 case 4:
							 if(num1<num2 && num1<num3) {
								 ComputerAns=num1;
							 }else if(num2<num1 && num2<num3){
								ComputerAns=num2;
							 }else {
								 ComputerAns=num3;
							 }
							 System.out.println("Choose the Smallest number form these numbers: "+ num1 +" "+ num2 +" "+ num3);
							 UserAns=userInput.nextInt();
						 }
						 
						 //This part chooses the good feedback
						 int goodFeedback= randNum.nextInt(4);
						 switch(goodFeedback) {
							 case 1:
								 goodInput=("Great job");
								 break;
							 case 2:
								 goodInput=("Excellent job");
								 break;
							 case 3:
								 goodInput=("Good job");
								 break;
						 }
						 
						//This part chooses the bad feedback
						 int badFeedback= randNum.nextInt(4);
						 switch(badFeedback) {
							 case 1:
								 badInput=("Wrong Answer");
								 break;
							 case 2:
								 badInput=("At least you Tried.....");
								 break;
							 case 3:
								 badInput=("Better luck next time");
								 break;
						 }
						 
						 //This part compare the answers and then randomly gives good and bad feedback depending on if the answer is correct or not
						 if(UserAns==ComputerAns) {
								System.out.println(goodInput);
								numCorrect+=1;
							}else {
								System.out.println(badInput);
							}
						  
				 }
				 //This part displays the score
				 System.out.println("Your score is: "+numCorrect+"/10");
				 //This part asks if they want to play again
				 System.out.println("Do you want to play again?");
				 String Answer=userInput.next();
				 //This part helps continue or break the loop depending on if they want to keep going
				 if(Answer.equals("Yes")) {
					 Choice+=0;
				 }else {
					 System.out.println("Goodbye!");
					 Choice+=1;
				 }
			 
		}
		//This is the condition to run the program again
	while(Choice<1);	 
		 
		 

	}

}
