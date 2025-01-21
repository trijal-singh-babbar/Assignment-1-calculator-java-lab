//main.java

import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();
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
	}
}