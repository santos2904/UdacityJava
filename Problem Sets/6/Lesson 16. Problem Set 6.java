Lesson 16: Problem Set 6

1. Write one line of code to declare and instantiate an ArrayList of Color objects using the Color class from the lesson.  Call the variable palette.
A: ArrayList<Color> palette = new ArrayList<Color>();

2. Write the code to add Color.RED to an ArrayList of Colors named palette.
A: palette.add(Color.RED);

3. An Arraylist of Colors named palette has been populated with 9 colors. Complete the line of code below to get the last element in the ArrayList.
A: Color color = palette.get(8) 
// array index starts at 0

4. // Complete the given class to display the picture object vertically
// (rather than horizontally).
// You can find the pictures required in the bluej project
// Place the first picture so that the top of the picture is 10 pixels below 
// the top of the canvas and put 10 pixels between the pictures

import java.util.ArrayList;

public class ListOfVerticalPictures {
    public static void main(String[] args) {
        ArrayList<Picture> gallery = new ArrayList<Picture>();
        gallery.add(new Picture("degas1.jpg"));
        gallery.add(new Picture("gaugin1.jpg"));
        gallery.add(new Picture("monet1.jpg"));
        gallery.add(new Picture("monet2.jpg"));
        gallery.add(new Picture("renoir1.jpg"));

        // TODO Write the code to display the pictures vertically
        int pixels = 0;
        for (Picture pic: gallery) {
            pixels = pixels + 10;
            pic.translate(0, pixels);
            pixels = pic.getMaxY();
            pic.draw();
        }
    }
}

5. Complete the code to get the size of an array list named palette. 
A: int size = palette.size();

6. An ArrayListof Colors named palettehas been populated with some unknown number of colors.
   Complete the line of code below to get the last element in the ArrayList.
A: Color color = palette.get(palette.size() -1);

7. // Complete the given class to shift the first picture (the one at index 0)
// to the end of the array list and  display the pictures object in the modified list
// horizontally as was done in the lesson.  Put 10 pixels between pictures.  The first
// picture should be 10 pixels from the left edge of the screen as well.
// You can find the pictures required in in the bluej project

import java.util.ArrayList;

public class ShiftFirstToEnd {
    public static void main(String[] args) {
        ArrayList<Picture> gallery = new ArrayList<Picture>();
        gallery.add(new Picture("degas1.jpg"));
        gallery.add(new Picture("gaugin1.jpg"));
        gallery.add(new Picture("monet1.jpg"));
        gallery.add(new Picture("monet2.jpg"));
        gallery.add(new Picture("renoir1.jpg"));
		
		// TODO 		
        gallery.add(gallery.get(0));
        gallery.remove(0);
        int pixels = 0;
        for (Picture pic : gallery) {
            pixels = pixels + 10;
            pic.translate(pixels, 0);
            pixels = pic.getMaxX();
            pic.draw();
		}
	}
}

8. // Complete the given class to display the last picture in the array list
// The required pictures are in the BlueJ project

import java.util.ArrayList;

public class DisplayLastPictures
{
    public static void main(String[] args)
    {
        ArrayList<Picture> gallery = new ArrayList<Picture>();
        gallery.add(new Picture("degas1.jpg"));
        gallery.add(new Picture("gaugin1.jpg"));
        gallery.add(new Picture("monet1.jpg"));
        gallery.add(new Picture("monet2.jpg"));
        gallery.add(new Picture("renoir1.jpg"));

        // TODO display the last picture in the array list
        gallery.get(gallery.size() -1).draw();
    }
}

9. Find index of next to last element in an array list named palette.
A: int index = palette.size()-2;

10. What will this code segment print?
ArrayList<String> names = new ArrayList<String>();
names.add("Bob");
names.add(0, "Ann");
names.remove(1);
names.add("Cal");

System.out.println(names);

A: Ann, Cal

11. // Complete this class to do the following.
// 1. Define and create an ArrayList of Strings called animals
// 2. Add the string "ape"
// 3. Add the string "dog"
// 4. Add the string "horse"
// 5. print the arraylist

import java.util.Scanner;
import java.util.ArrayList;

public class AddTester
{
    public static void main(String[] args)
    {
        // TODO: Define and create an ArrayList of Strings called animals
        ArrayList<String> animals = new ArrayList<String>();

        // TODO: Add the strings "ape", "dog", "horse"
        animals.add("ape");
        animals.add("dog");
        animals.add("horse");
        
        System.out.println(animals);
        System.out.println("Expected: [ape, dog, horse]");
    }
}

12. // Complete this class. An array list of Strings called cities has been defined
// for you and partially populated. Add code to do the following:
// 1. Add the string "New York so that it is first in the arraylist
// 2. replace the string "Dallas" (should be at index 2. Don't search) with "Houston"
// 3. remove last element in the list
// 4. print the arraylist

import java.util.ArrayList;

public class ArrayListMethodTester
{
    public static void main(String[] args)
    {
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Chicago");
        cities.add("Dallas");
        cities.add("San Jose");
        cities.add("Seattle");

        // TODO: Add code for steps 1-4 above
        cities.add(0, "New York");
        cities.remove("Dallas");
        cities.add(2, "Houston");
        cities.remove(cities.size() -1);

        // TODO: Print the arraylist
        System.out.println(cities);
        System.out.println("Expected: [New York, Chicago, Houston, San Jose]");
    }
}

13. // Complete this class. An array list of Strings called cities has been defined
// for you and populated. You are to print the elements, one to a line (please 
// use a for loop). Afterwards, print the element at index 2.

import java.util.ArrayList;

public class GetAndLoopDemo
{
    public static void main(String[] args)
    {
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Chicago");
        cities.add("Dallas");
        cities.add("San Jose");
        cities.add("Seattle");

        // TODO: Use a loop to print the elements one to a line
        for (String city: cities) {
            System.out.println(city);
        }
        // TODO: Print the element at index 2
        System.out.println(cities.get(2));

    }
}

14. // Complete the method in this class to find the average length of the words in an
// array list of strings and return it. The average length of words is sometimes used
// as a simple measure of reading difficulty.
// Note that you want to keep the fractional part of the average
// Hint: If you do not know where to start, look at the ArrayList Algorithms to find
// an appropriate one.

import java.util.ArrayList;

public class StringArrays
{
    public double averageCountPerWord(ArrayList<String> words)
    {
        double average = 0;
        double count = 0.0; //defined as double so we do double division
        // TODO: Find the total number of characters in all the words
        double length = 0;
        for (String w : words) {
            length = length + w.length();
            count = count + 1;
        }
        // TODO: Calculate the average
        if (count > 0) //supply the condition
        {
            average = length / count;//your code here
        }
        return average;
    }
}

15. // Complete the method in this class to compute and return the shortest string
// (the one with the fewest characters)
// HINT: You can use the ArrayList algorithm for finding the minimum
import java.util.ArrayList;
public class StringArrayUtil
{
   public String shortestString(ArrayList<String> words)
   {
      // TODO: initialize the string to the hold the shortest string
      String shortest = words.get(0); //initialize
      int shortestLen = shortest.length();

      // TODO: Write the code to find the shortest string
       for (String word : words)
       {
           int length = word.length();
           if (length < shortestLen)
           {
               shortestLen = length;
               shortest = word;
           }
       }
      return shortest;
   }
}

16. // Complete the method in the class to print the elements in the array list in reverse order,
// one to a line.
// HINT: Use a for loop. Start with i = last index and work backwards.

import java.util.ArrayList;

public class ReversePrinter
{
    /**
     * prints the array list in reverse order, one to a line
     * @param text the array list to print
     */
     public void reversePrint(ArrayList<String> text)
     {
         // TODO: Write the code to print the elements in the array list in reverse order,
         // one to a line.
         int length = text.size();
		 for (int i = length - 1; i >= 0; i--) {
			 System.out.println(text.get(i));
		 }
	 }
}


