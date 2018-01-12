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

15. Complete this code to swap the element 0 and 1
int[] scores = {65, 71, 68, 85, 87, 89, 78};

int temp = scores[0];
scores[0] = scores[1];
scores[1] = temp;

16. // Complete the method in this class. It returns a string with the elements of the array
// in reverse order separated by a space. If the array looks like this [1, 2 ,3 ,4], your
// output will look like this:
// 4 3 2 1

public class ArrayUtil
{
    /**
     * Returns a string with the elements of the array in reverse order separated by a space
     * @param values the array to reverse
     * @return the string containing the elements in reverse order
     */
    public String inReverse(int[] values) {
        String message ="";
        for (int value : values) { //finish the loop header
            message = value + " " + message;// TODO: concatenate the elements to message in reverse order
        }
        return message;
    }
}

17. // Complete this method to return the number of zeros in the int array
// parameter "values"

public class Util
{
    public int getCount(int[] values)
    {
        int count = 0;
        for (int current : values)
        {
            // TODO: count the number of zeros in values
            if (current == 0) {
                count ++;
            }
        }
        return count;
    }
}

18. Given the following array
int[] values = {1, 2, 3, 4, 5, 4, 3, 2, 1, 9};
What is the value of the sum after the following for loop completes?
int sum = 0;
for (int i = 0; i < 9; i++) {
	sum = sum + values[i];
}
Output: 25

19. Given the following array
int[] values = {1, 2, 3, 4, 5, 4, 3, 2, 1, 9};
What is the value of the sum after the following for loop completes?
int sum = 0;
for (int i = 9; i >= 0; i--) {
	sum = sum + values[i];
}
Output: 34

20. // Complete the method to fill an int array with random integers between 0 and 100 (exclusive)
//HINT: generate the random number using generator.nextInt(100)

import java.util.Random;

public class ArrayProcessor
{
    private Random generator;

    //do not change the constructor
    public ArrayProcessor()
    {
        generator = new Random();
        generator.setSeed(1234); // do not change the seed
    }

    /**
     * Fills the array with random integers between 0 and 100 (exclusive)
     * @param values, the int[] that you need to fill with random integers
     */
    public void fill(int[] values)
    {
		for (int i = 0; i < values.length; i++) {
			values[i] = generator.nextInt(100);
        }
    }
}

