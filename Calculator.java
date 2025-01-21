// calculator.java

class Calculator
{
	double[] numbers;
	int n;
	int[] arr;
	
	//function to input numbers for calculator
	void takeInput()
	{
		UserInput input = new UserInput();
		numbers = input.userInput();
	}
	
	//function to add 2 numbers
	double addingNumbers()
	{		
		double sum = numbers[0] + numbers[1];
		return sum;
	}
	
	//function to find difference between 2 numbers
	double subtractingNumbers()
	{
		double diff = numbers[0] - numbers[1];
		return diff;
	}
	
	//function to divide 2 numbers
	double dividingNumbers()
	{
		double quotient = numbers[0] / numbers[1];
		return quotient;
	}
	
	//function to multiply 2 numbers
	double multiplyingNumbers()
	{
		double prod = numbers[0] * numbers[1];
		return prod;
	}
	
	//function to input number of terms for fibonacci series
	int noOfTerms()
	{
		UserInput inp = new UserInput();
		n = inp.fibLimit();
		return n;
	}
	
	//function to print fibonacci series
	void printFibonacciSeries(int n)
	{
        int firstTerm = 0, secondTerm = 1;
        
        System.out.println("Fibonacci Series up to " + n + " terms:");
        
        for (int i = 1; i <= n; i++) 
		{
            System.out.print(firstTerm + " ");
            
            // Calculate the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
		System.out.println();
	}
	
	//function to enter array
	void arrInput()
	{
		UserInput arinput = new UserInput();
		n = arinput.arrayLength();
		arr = arinput.arrayInput(n);
	}
	
	//function to calculate sum and mean of array
	void arrayDetails()
	{
		int sum = 0;
		int i;
		for(i=0;i<n;i++)
		{
			sum = sum + arr[i];
		}
		System.out.println("Sum of array = "+sum);
		double mean = sum/n;
		System.out.println("Mean of array = "+mean);
	}
}