//Translate the following pseudocode for randomly permuting the characters in
//a string into a method in the given Java class.

//Read a word.
//Repeat word.length() times
//   Pick a random position i in the word, but not the last position.
//   Pick a random position j > i in the word. (this is tricky)
//   Swap the letters at positions j and i.
//Print the word.

//To swap the letters, construct substrings as follows:
//  http://i.imgur.com/re4bGPu.png

//Create and return the string:
//   first + word.substring(j, j + 1) + middle
//         + word.substring(i, i + 1) + last

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 5 - Question 2" for some tips on 
// how to begin.

//I recommend that you implement and test the swapping before implementing
//the loop. If something is wrong in the swap, it will be much more difficult
//to find it you have executed the swap many times. That is an example of
//step-wise refinement. Code a little, test, code a little more.

import java.util.Random;
/**

 */
public class Word
{
   private Random generator = new Random();

   public Word()  //leave the constructor alone
   {
        generator = new Random();
        final long SEED = 42;
        generator.setSeed(SEED);
   }
   /**
    * Gets a version of this word with the leters scrambled
    * @param word the string to scramble
    * @return the scrabled string
    */
   public String scramble(String word)
   {
       int wordLength = word.length();
       int i, j;
       String first, middle, last;
       for (int n = 0; n < wordLength; n ++)
       {
           i = generator.nextInt(wordLength -1);
           j = generator.nextInt(wordLength -i -1) + i + 1;
           if (i == 0){
               first = "";
           }
           else{
               first = word.substring(0, i);
           }
           if (i + 1 == j){
               middle = "";
           }
           else{
               middle = word.substring (i + 1, j);
           }
           if (wordLength - 1 == j){
               last = "";
           }
           else {
               last = word.substring(j + 1, wordLength);
           }
           word = first + word.substring (j, j + 1) + middle + word.substring(i, i + 1) + last;
       }
        return word; //TODO scramble the letters following the pseudocode
   }


}
