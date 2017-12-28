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

17. // Complete the method in this class to print the length of each string
// all on one line separated by spaces.

import java.util.ArrayList;

public class ArrayListUtil
{
    /**
     * prints length of each string in the arraylist all on one line
     * @param text the array list to process
     */
     public void getLengths(ArrayList<String> text)
     {
         // TODO: Use a loop to print the length of each string all on one line
         // separated by spaces
         for (String string : text) {
             int length = string.length();
             System.out.print(length + " ");
         }
     }
}

18. // Complete the method in this class to return the number of strings
// that start with the target

import java.util.ArrayList;

public class Counter
{
    /**
     * Gets the number of strings that starts with the target
     * @param text the array list to process
     * @param target the desired letter
     * @return the count of strings starting with target
     */
     public int getCount(ArrayList<String> text, String target)
     {
         // TODO: Adapt an ArrayList algorithm to return the number of Strings that
         // start within the target
		 int count = 0;
		 for(String word : text) {
			 if(word.startsWith(target)) {
				 count ++;
			 }
		 }
		 return count;
	 }
}

19. // Complete the method in this class to return the index of the first string
// that starts with the target. Return -1 if no string starts with the target

import java.util.ArrayList;

public class Finder
{
    /**
     * Gets the index of the first String that starts with the target
     * @param text the array list to process
     * @param target the desired letter
     * @return the index of first string starting with target or -1 if not found
     */
     public int getIndex(ArrayList<String> text, String target)
     {
         int i = 0;
         int index = -1;
         boolean found = false;
         int length = text.size();
         while (i < text.size() && !found) //supply condition
         {              // TODO: Adapt an ArrayList algorithm to return the index of the first
             if (text.get(i).startsWith(target)) { // string that start with the target
                 index = i;
                 found = true;
             }
             i++;
         }
         return index; // TODO: Return -1 if no string starts with the target
     }
}

20. // Complete the method in this class to return the first string that starts
// with the target. Return null if no string starts with the target.

import java.util.ArrayList;

public class StringFinder
{
    /**
     * Gets the first String that starts with the target
     * @param text the array list to process
     * @param target the desired letter
     * @return the first string starting with target or null if not found
     */
     public String getTarget(ArrayList<String> text, String target)
     {
         int i = 0;
         String startsWith = null;
         boolean found = false;
		 while (i < text.size() && found == false) {
			 if (text.get(i).startsWith(target)) {
				 startsWith = text.get(i);
				 found = true;
			 }
			 i++;
         }
         return startsWith;
     }
}

21. //Complete the class ArrayListMethods. It consists of four short methods
//to manipulate an array list of strings. The method header and javadoc
//are given to you.

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 6 - Question 1" for some tips on 
// how to begin.

import java.util.ArrayList;

public class ArrayListMethods
{
    ArrayList<String> list; //instance variable
    /**
     * Constructor for objects of class ArrayListMethods
     */
    public ArrayListMethods(ArrayList<String> arrayList)
    {
        // initialise instance variables
        list = arrayList;
    }

    /**
     * Determines if the array list is sorted (do not sort)
     * When Strings are sorted, they are in alphabetical order
     * Use the compareTo method to determine which string comes first
     * You can look at the String compareTo method in the Java API
     * @return true if the array list is sorted else false.
     */
    public boolean isSorted()
    {
        boolean sorted = true;
		if (list.size() > 1) {
        	int i = 1;
            while (sorted && i < list.size()) {
            	if (list.get(i).compareTo(list.get(i - 1)) < 0) {
            		sorted = false;
            	}
            	i++;
            }
        }
        return sorted;
    }

    /**
     * Replaces all but the first and last elements with the larger of its two neighbors
     * You can use the compareTo() method to determine which string is larger (larger in alphabetical
     * order).
     * Example: if the list is originally
     *    ["cat", "ape", "dog", "horse", "zebra"]
     * after this method it should be: 
     *    ["cat", "dog", "horse", "zebra", "zebra"]
     */
    public void replaceWithLargerNeighbor()
    {

        // TODO: Replace all but the first and last elements with the larger of its two neighbors
    }

    /**
     * Gets the number of duplicates in the list.
     * Be careful to only count each duplicate once. Start at index 0. (Does it match any of the other elements?)
     * Get the next word. It is at index i. (Does it match any of the words with index > i?)
     * @return the number of duplicate words in the list
     */
    public int countDuplicates()
    {
        int duplicates = 0;

        // TODO: Write the code to get the number of duplicates in the list

        return duplicates;
    }

     /**
     * Moves any word that starts with x, y, or z to the front of the ArrayList, but
     * otherwise preserves the order
     * Example: if the list is orginially
     *   ["ape", "dog", "xantus", "zebra", "cat", "yak"]
     * after this method is called it should be
     *   ["xantus", "zebra", "yak", "ape", "dog", "cat"]
     */
    public void xyzToFront()
    {
        int insertAt = 0;

        // TODO:  Move any word that starts with x, y, or z to the front of the ArrayList, but otherwise preserves the order

    }

    /**
     * gets the string representation of this array list
     * @returns the string representation of this array list in
     * standard collection format
     */
    public String toString()
    {
        return list.toString();
    }
}


