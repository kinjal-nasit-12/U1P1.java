/* Write a program to calculate the hypotenuse of right angled triangle when other 
sides of the triangle are given. (Hypotenuse = square root (x*x + Y *Y)) */
import java.util.Scanner;

class U1P5 {

    public static void main(String[] args) {
        int x, y;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value 1: ");
        x = s.hasNextInt() ? s.nextInt() : 0;
        System.out.println("Enter value 2: ");
        y = s.hasNextInt() ? s.nextInt() : 0;
        double hypontenuse = Math.sqrt((x * x) + (y * y));
        System.out.println("Hypontenuse: " + hypontenuse);
        s.close();
    }
}
