// userinput.java

import java.util.*;
class UserInput
{
	double[] userInput()
	{
		Scanner sc = new Scanner(System.in);
		double[] numbers = new double[2];
		
		System.out.println("Enter first number: ");
		numbers[0] = sc.nextDouble();
		
		System.out.println("Enter second number: ");
		numbers[1] = sc.nextDouble();
		
		return numbers;
	}
}