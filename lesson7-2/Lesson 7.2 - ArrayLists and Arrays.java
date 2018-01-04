//1. Arrays
double [] values = new double [10];
//double[] is the type
//[10] is the length (cannot change)

double[] moreValues = {32, 54, 67.5, 29, 35};
//another way of constructing an array

//2. Array Elements

double firstValue = values[0];
//[0] is the index

values[0] = 42
//Storing value 42 to 0

for (int i = 0; < values.length; i++) {
	System.out.println(values[i]);
}
// for loop

for (double value : values) {
	System.out.println(values);
}
// enchanced for loop

//3. Declare an Array Containing the First Five Primes in one line
A: int prime[] = { 2, 3, 5, 7, 11 };

//4. How does this loop Modify the Array?
int[] primes = { 2, 3, 5, 7, 11 };

for (int i = 0; i < 2; i++) {
	primes [4 - i] = primes[i];
}
//What does primes contain after running this loop?

A: 2, 3, 5, 3, 2