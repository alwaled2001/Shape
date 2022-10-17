package shape;

/**
 *
 * @author
 */
public class Rectangle {

    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;

    }
    public int getArea() {
        return length*breadth;  // write code to calculate area here
    }

    public int getperimeter() {
        return (length+breadth)*2 ; }// write code to calculate perimeter here // getPerimeter()

}