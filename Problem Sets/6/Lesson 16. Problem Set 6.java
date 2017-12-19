Lesson 16: Problem Set 6

1. Write one line of code to declare and instantiate an ArrayList of Color objects using the Color class from the lesson.  Call the variable palette.
A: ArrayList<Color> palette = new ArrayList<Color>();

2. Write the code to add Color.RED to an ArrayList of Colors named palette.
A: palette.add(Color.RED);

3. An Arraylist of Colors named palette has been populated with 9 colors. Complete the line of code below to get the last element in the ArrayList.
A: Color color = palette.get(8) 
// array index starts at 0

4. 
// Complete the given class to display the picture object vertically
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

7. 
// Complete the given class to shift the first picture (the one at index 0)
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

8.
// Complete the given class to display the last picture in the array list
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




