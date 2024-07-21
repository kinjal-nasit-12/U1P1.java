/* Write a program to calculate the area of square and rectangle by
overloading the area method. */

import java.util.Scanner;

class U1P6 {
    public static void main(String[] args) {
        int l, w;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter length: ");
        l = s1.nextInt();
        System.out.println("Enter width: ");
        w = s1.nextInt();
        area(l);
        area(l, w);
        s1.close();
    }

    public static void area(int l) {
        int sa = l * l;
        System.out.println("square area: " + sa);
    }

    public static void area(int l, int w) {
        int ra = l * w;
        System.out.println("rectangle area: " + ra);
    }
}
