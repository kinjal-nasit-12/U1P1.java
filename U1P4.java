/* Write a java program to scan 3 integer values from the command line argument
and display the maximum number using conditional operator. */
class U1P4 {

    public static void main(String args[]) {
        int a, b, c, max;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);
        max = (a > b && a > c) ? a : b > c ? b : c;
        System.out.println("Maximum number is: " + max);
    }
}
