/* Create a complex number class. The class should have a constructor
and methods to add, subtract and multiply two complex numbers
and to return the real and imaginary parts. */
//(constructor overloading)
class U1P7 {
    int r, i;

    U1P7() {
        r = i = 0;
    }

    U1P7(int x, int y) {
        r = x;
        i = y;
    }

    U1P7(int x) {
        i = r = x;
    }

    public void display() {
        System.out.println("value of R= " + r);
        System.out.println("value of I= " + i);
    }

    public static U1P7 addition(U1P7 s1, U1P7 s2) {
        U1P7 s3 = new U1P7();
        s3.r = s1.r + s2.r;
        s3.i = s1.i + s2.i;
        return s3;
    }

    public static U1P7 subtraction(U1P7 s1, U1P7 s2) {
        U1P7 s3 = new U1P7();
        s3.r = s1.r - s2.r;
        s3.i = s1.i - s2.i;
        return s3;
    }

    public static U1P7 multiplication(U1P7 s1, U1P7 s2) {
        U1P7 s3 = new U1P7();
        s3.r = s1.r * s2.r;
        s3.i = s1.i * s2.i;
        return s3;
    }

    public static void main(String args[]) {
        U1P7 s3 = new U1P7();
        System.out.println("object 3 data.");
        s3.display();
        
        U1P7 s2 = new U1P7(5);
        System.out.println("object 2 data.");
        s2.display();
        
        U1P7 s1 = new U1P7(5, 6);
        System.out.println("object 1 data.");
        s1.display();
        
        s3 = addition(s1, s2);
        System.out.println("Addition of object 1 and object 2 is: ");
        s3.display();
        
        s3 = subtraction(s1, s2);
        System.out.println("Subtraction of object 1 and object 2 is: ");
        s3.display();
        
        s3 = multiplication(s1, s2);
        System.out.println("Multiplication of object 1 and object 2 is: ");
        s3.display();
    }
}
