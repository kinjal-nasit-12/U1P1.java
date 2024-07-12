/* Write a program to evaluate simple interest of a given principle, rate and time. */
class U1P1 {

    public static void main(String args[]) {
        int p=5000, r=4, n=5, si;
        si = p * r * n / 100;
        System.out.println("Principle:" + p);
        System.out.println("Rate:" + r);
        System.out.println("Time:" + n);
        System.out.println("Simple interest:" + si);
    }
}
