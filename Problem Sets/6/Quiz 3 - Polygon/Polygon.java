//Create a Polygon class. A polygon is a closed shape with lines joining the corner points.
//You will keep the points in an array list. Use object of java.awt.Point for the point.

//Polygon will have as an instance variable an ArrayList of Points to hold the points
//The constructor takes no parameters but initializes the instance variable.  The
//Polygon class also has the following methods:
//    add: adds a Point to the polygon
//    perimeter: returns the perimeter of the polygon
//    draw: draws the polygon by connecting consecutive points and then
//          connecting the last point to the first.
//
//No methods headers or javadoc is provided this time. You get to try your hand at writing
//a class almost from scratch
// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 6 - Question 3" for some tips on 
// how to begin.
import java.util.ArrayList;
import java.awt.Point;

public class Polygon {

    // TODO: provide the required constructor, instance variable, and methods
    private ArrayList<Point> polygon;

    public Polygon() {
        polygon = new ArrayList<Point>();
    }

    public void add(Point point) {
        polygon.add(point);
    }

    public double perimeter() {
        double a, b, c, d;
        double perimeter = 0;
        if (polygon.size() < 2) {
            return 0;
        }
        Point point1 = polygon.get(polygon.size() - 1);
        for (int i = 0; i < polygon.size() - 1; i++) {
            Point point2 = polygon.get(i);
            a = point2.getX();
            b = point2.getY();
            c = point1.getX();
            d = point1.getY();
            perimeter = perimeter + Math.sqrt(Math.pow((a - c), 2) + Math.pow((b - d), 2));
            point1 = point2;
        }
        return perimeter;
    }

    public void draw() {

    }
}
