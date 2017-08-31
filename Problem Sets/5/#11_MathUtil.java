// Complete this method to read integer scores from the user and find the average
// Stop asking for input when the user enters a negative number.
// Keep a running total and keep track of the number of entries,
// then find and return the average

// Be sure not to divide by 0. Return 0 if no scores are entered

import java.util.Scanner;

public class MathUtil
{
    public double averageScore()
    {
        Scanner in = new Scanner(System.in);
        int score;
        int total = 0;
        int count = 0;
        do
        {
            System.out.print("Enter a score. -1 to quit: "); //use this for the prompt
            score = in.nextInt();
            total = total + score;
            count ++;
        }
        while (score > -1);
        return (total/count);
    }
}
