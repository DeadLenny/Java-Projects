package Lab3;

import javax.swing.JOptionPane;
public class task1 {

	public static void main(String[] args) {
		int evenNum=0;
		int evenSum=0;
		int oddSum=0;
		int oddNum=0;
		int oneDigit=0;
		int oneSum=0;
		int twoDigit=0;
		int twoSum=0;
		//This part gets the variables from the user. 
		String num=JOptionPane.showInputDialog("Choose first integer");
		int num1=Integer.parseInt(num);
		String nums=JOptionPane.showInputDialog("Choose second integer");
		int num2=Integer.parseInt(nums);
		String numss=JOptionPane.showInputDialog("Choose third integer");
		int num3=Integer.parseInt(numss);
		String numsc=JOptionPane.showInputDialog("Choose fourth integer");
		int num4=Integer.parseInt(numsc);
		
		// This prints the largest number
		if(num1> num2 && num1>num3 && num1>num4) {
			System.out.println("The Largest Number is: "+num1);
		}else if(num2> num1 && num2>num3 && num2>num4) {
			System.out.println("The Largest Number is: "+num2);
		}else if(num3> num1 && num3>num2 && num3>num4) {
			System.out.println("The Largest Number is: "+num3);
		}else {
			System.out.println("The Largest Number is: "+num4);
		}
		// This prints the smallest number
		if(num1< num2 && num1<num3 && num1<num4) {
			System.out.println("The Smallest Number is: "+num1);
		}else if(num2< num1 && num2<num3 && num2<num4) {
			System.out.println("The Smallest Number is: "+num2);
		}else if(num3< num1 && num3<num2 && num3<num4) {
			System.out.println("The Smallest Number is: "+num3);
		}else {
			System.out.println("The Smallest Number is: "+num4);
		}
	//This part counts even and odd numbers and their sum
	if((num1 % 2)==0) {
		evenNum+=1;
		evenSum+=num1;
	}
	else {
		oddNum+=1;
		oddSum+=num1;
	}
	
	if((num2 % 2)==0) {
		evenNum+=1;
		evenSum+=num2;
	}
	else {
		oddNum+=1;
		oddSum+=num2;
	}
	if((num3 % 2)==0) {
		evenNum+=1;
		evenSum+=num3;
	}
	else {
		oddNum+=1;
		oddSum+=num3;
	}
	if((num4 % 2)==0) {
		evenNum+=1;
		evenSum+=num4;
	}
	else {
		oddNum+=1;
		oddSum+=num4;
	}
	System.out.println("Number of Even numbers: "+ evenNum);
	System.out.println("Number of Odd numbers: "+ oddNum);
	System.out.println("Sum of Even numbers: "+ evenSum);
	System.out.println("Sum of Odd numbers: "+ oddSum);
	
	
	//This part calculates the number of one digit and two digit numbers and their sum
	if(num1 >9 && num1<100) {
		twoDigit+=1;
		twoSum+=num1;
	}
	else {
		oneDigit+=1;
		oneSum+=num1;
	}
	
	if(num2 >9 && num2<100) {
		twoDigit+=1;
		twoSum+=num2;
	}
	else {
		oneDigit+=1;
		oneSum+=num2;
	}
	if(num3 >9 && num3<100) {
		twoDigit+=1;
		twoSum+=num3;
	}
	else {
		oneDigit+=1;
		oneSum+=num3;
	}
	if(num4 >9 && num4<100) {
		twoDigit+=1;
		twoSum+=num4;
	}
	else {
		oneDigit+=1;
		oneSum+=num4;
	}
	System.out.println("Number of Single Digit: "+ oneDigit);
	System.out.println("Number of Two Digit : "+ twoDigit);
	System.out.println("Sum of Single Digit: "+ oneSum);
	System.out.println("Sum of Two Digit : "+ twoSum);
	}

}
