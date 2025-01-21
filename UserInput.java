// userinput.java

import java.util.*;
class UserInput
{
	int len;
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
	
	int fibLimit()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of terms for fibonacci series");
		int n = sc.nextInt();
		return n;
	}
	
	int arrayLength()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length");
		len = sc.nextInt();
		return len;
	}
	
	int[] arrayInput(int len)
	{
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[len];
		System.out.println("Enter array of "+len+" elements");
		for(int i=0;i<len;i++)
		{
			ar[i] = sc.nextInt();
		}
		return ar;
	}
}