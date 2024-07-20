/* A bank gives 6.5% per annum interest on deposits made in that bank. Write a
program to calculate the total amount that a person will receive after the end of 5
years for a deposit of Rs.5000 for compound interest. Create necessary methods
and constructors too */
class U1P9 {

    float r;
    double ci, net_amount;
    int n, amt;

    U1P9() {
        r = 6.5f;
        ci = 0.0f;
        n = 5;
        amt = 5000;
    }

    public void Comp_int() {
        ci = amt * Math.pow((1 + r / 100), n);
        net_amount = amt + ci;
    }

    public void display() {
        System.out.println("Rate: " + r);
        System.out.println("Year: " + n);
        System.out.println("Amount: " + amt);
        System.out.println("Compound interest: " + ci);
    }

    public static void main(String args[]) {
        U1P9 s = new U1P9();
        s.Comp_int();
        s.display();
    }
}
