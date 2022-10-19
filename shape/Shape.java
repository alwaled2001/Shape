package shape;

import java.util.Scanner;

/**
 *
 * @author
 */
public class Shape {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter length and breadth of rectangle: ");

        Rectangle r = new Rectangle(s.nextInt(), s.nextInt());
        System.out.println("area of Rectangle = " + r.getArea());
        System.out.println("perimeter of Rectangle ="+ r.getperimeter());
        // Write code to print out perimeter of rectangle
    }

}