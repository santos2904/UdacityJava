// This modifies the previous problem. Start with that solution as your base
// Complete the code to write nested loops that make the a pattern of brackets: a
// rows x colomuns figure of []
// For example if rows = 2 and columns = 5, the figure will look like this:
//[][][][][]
//[][][][][]

//TODO print the specified number of rows and columns of []
public class Drawings
{
    /**
     * Prints a rows by column array of blocks ([])
     * @param rows the number of rows of []
     * @param columns the number of columns of []
     */
     public void blockPrinter(int rows, int columns)
     {
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                System.out.print("[]");
            }
            System.out.println();
        }
     }
}
