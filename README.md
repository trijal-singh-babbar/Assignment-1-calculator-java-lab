# Calculator, Fibonacci and array operation
This program is used for basic calculator operations and printing fibonacci series and calculating the sum and mean array
## UserInput class
This class accepts all kinds of inputs from the user 
### double userInput()
This takes 2 numbers as input for basic calculator operations and returns them as an array
### int fibLimit()
This method takes the number of terms for fibonacci series
### int arrayLength()
This method takes the number of elements in the array
### int arrayInput()
This takes the elements of the array as input

## Calculator class
### Methods

#### `void takeInput()`
- **Description**: Takes two numbers as input from the user.
- **Usage**: This method initializes the `numbers` array with two user-provided values.

#### `double addingNumbers()`
- **Description**: Adds the two numbers input by the user.
- **Returns**: Sum of the two numbers.

#### `double subtractingNumbers()`
- **Description**: Subtracts the second number from the first.
- **Returns**: Difference between the two numbers.

#### `double dividingNumbers()`
- **Description**: Divides the first number by the second.
- **Returns**: Quotient of the division.

#### `double multiplyingNumbers()`
- **Description**: Multiplies the two numbers.
- **Returns**: Product of the two numbers.

#### `int noOfTerms()`
- **Description**: Takes the number of terms for the Fibonacci series as input from the user.
- **Returns**: Number of terms for the Fibonacci series.

#### `void printFibonacciSeries(int n)`
- **Description**: Prints the Fibonacci series up to `n` terms.
- **Parameters**: 
  - `n` (int): Number of terms to be printed.

#### `void arrInput()`
- **Description**: Takes input for the array from the user.
- **Usage**: Initializes the `arr` array and its length `n` with user-provided values.

#### `void arrayDetails()`
- **Description**: Calculates and prints the sum and mean of the array elements.
- **Output**: 
  - Sum of the array elements.
  - Mean of the array elements.
 
## Main class
- **`public static void main(String[] args)`**: 
  - Presents a menu to the user with the following options:
    - **Basic Calculator**: Allows the user to perform addition, subtraction, multiplication, and division.
    - **Fibonacci Series**: Prompts the user to input the number of terms and displays the Fibonacci series.
    - **Array Operations**: Prompts the user to input an array and displays its sum and mean.
  - Based on the user's choice, appropriate methods from the `Calculator` class are invoked.
