/* Write a program to calculate the hypotenuse of right angled triangle when other 
sides of the triangle are given. (Hypotenuse = square root (x*x + Y *Y)) */
import java.util.Scanner;

class U1P5 {

    public static void main(String[] args) {
        int x, y, z;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value 1: ");
        x = s.nextInt();
        System.out.println("Enter value 2: ");
        y = s.nextInt();
        double h = Math.sqrt((x * x) + (y * y));
        System.out.println("Hypontenuse: " + h);
    }
}
