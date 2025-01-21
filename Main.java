//Trijal Singh Babbar - AIML B3 - 23070126137
//main.java

import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();
		System.out.println("Enter 1 for Basic Calculator, 2 for Fibonacci Series , 3 for Array Operations");
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1:
			cal.takeInput();
			System.out.println("Enter 1 for Addition, 2 for Subtraction, 3 for Division, 4 for Multiplication ");
			int n = sc.nextInt();
			switch(n)
			{
				case 1:
				System.out.println("Sum is : "+cal.addingNumbers());
				break;
				
				case 2:
				System.out.println("Difference is : "+cal.subtractingNumbers());
				break;
				
				case 3:
				System.out.println("Quotient is :"+cal.dividingNumbers());
				break;
				
				case 4:
				System.out.println("Product is :"+cal.multiplyingNumbers());
				break;
				
				default:
				System.out.println("Wrong input");
				break;
			}
			break;
			
			case 2:
			Calculator c = new Calculator();
			int num = c.noOfTerms();
			c.printFibonacciSeries(num);
			break;
			
			case 3:
			Calculator ca = new Calculator();
			ca.arrInput();
			ca.arrayDetails();
			break;
			
			default:
			System.out.println("Wrong input");
		}
	}
 }