/* Write a program to calculate the area of square and rectangle by
overloading the area method. */

import java.util.Scanner;

class U1P6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length: ");
        int l =  s.hasNextInt() ? s.nextInt() : 0;
        System.out.println("Enter width: ");
        int w = s.hasNextInt() ? s.nextInt() : 0;
        area(l);
        area(l, w);
        s.close();
    }

    public static void area(int l) {
        int squareArea = l * l;
        System.out.println("Square area: " + squareArea);
    }

    public static void area(int l, int w) {
        int rectangleArea = l * w;
        System.out.println("Rectangle area: " + rectangleArea);
    }
}
