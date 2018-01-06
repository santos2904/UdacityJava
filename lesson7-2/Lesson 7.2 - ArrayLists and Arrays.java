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
int prime[] = { 2, 3, 5, 7, 11 };

//4. How does this loop Modify the Array?
int[] primes = { 2, 3, 5, 7, 11 };

for (int i = 0; i < 2; i++) {
	primes [4 - i] = primes[i];
}
//What does primes contain after running this loop?

2, 3, 5, 3, 2

//5. Put in the First and Last Spacces
int[] values = new int[10];

values[0] = 10;
values[value.length - 1] = 10;
// values[9] = 10;
	
//6. How would you declare an array of Strings with space for 10 values?
String[] array = new String[10];

// How would you declare an array of Strings that contains two values: "yes" and "no"?
String[] array = {"yes", "no"};

//7. Best Enchanced for loop
for (int i = 0; i < values.length; i++) {
	{if (values[i] == 0) {
		counter++;
	}
}
	