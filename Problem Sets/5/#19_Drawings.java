// Complete the code to write nested loops that make the following pattern of brackets:
//[][][][]
//[][][][]
//[][][][]

public class Drawings
{

    public void blockPrinter()
    {
        for (int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 4; j++)
            {
            System.out.print("[]");
            }
            System.out.println();
        }
    }
}
