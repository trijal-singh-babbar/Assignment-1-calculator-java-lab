// calculator.java

class Calculator
{
	double[] numbers;
	void takeInput()
	{
		UserInput input = new UserInput();
		numbers = input.userInput();
	}
	double addingNumbers()
	{		
		double sum = numbers[0] + numbers[1];
		return sum;
	}
	double subtractingNumbers()
	{
		double diff = numbers[0] - numbers[1];
		return diff;
	}
	double dividingNumbers()
	{
		double quotient = numbers[0] / numbers[1];
		return quotient;
	}
	double multiplyingNumbers()
	{
		double prod = numbers[0] * numbers[1];
		return prod;
	}
}