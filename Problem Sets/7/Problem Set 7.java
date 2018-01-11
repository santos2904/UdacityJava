1. Write the code to declare an array of doubles called prices
double[] prices;


2. Complete the statement to create an array of ints called scores that can hold 50 ints
int[] scores = new int[50];


3. double[] temperatures = new double[12];
What is the length of the array, that is how many elements can it hold?
12


4.  double[] temperatures = new double[12];
What is the initial value at index 5? 
0


5. double[] temperatures = new double[12];
Complete this code to print the element at index 9:
System.out.println(temperatures[9]); 

6. Write the statement to assign 95 to the first element of an int array scores
scores[0] = 95;

7.  Complete the code to initialise an array containing the prime numbers less than 10.
int[] primes = {2, 3, 5, 7};

8. double[] temperatures = new double[12];
the indexes can range from 0 to 11.

9. You have an int array variable scores of unknown length.
Complete the code to get the length of the array. You can assume the scores is not null.
int length = scores.length;

10. You have an in array variable scores of unknown length.
Write code to assign 98 to the last element of the array "scores". scores is of unknown length.
scores[scores.legnth - 1] = 98;

11. You have an int array variable scores of unknown length.
Complete the statement to print the first element of the array (that is, the element ad index 0).
You can assume the scores variable is not null.
System.out.println(scores[0]);

12. What is printed by this segment code?
int[] tempratures = {65, 71, 68, 85, 87, 89, 78};
int[] dailyTemps = temperatures;
dailyTemps[6] = 101;
System.out.println(temperatures[6]);
Output: 101

13. What is printed by this segment code?
int[] tempratures = {65, 71, 68, 85, 87, 89, 78};
int[] dailyTemps = Arrays.copyOf(temperatures, tempratures.length);
dailyTemps[6] = 101;
System.out.println(temperatures[6]);
Output: 78

14. Complete the code segment intended to get temperaturesfrom the user and assign the values
to an array using the companion variable, currentSize, to indicate the number of elements in the array
double[] temperatures = new double[365];
int currentSize = 0;
Scanner in = new Scanner(system.in);
while(in.hasNextDouble()) {
	if (currentSize < temperatures.legnth) {
		temperatures[currentSize] = in.nextDouble();
		currentSize++;
	}
}

15.
