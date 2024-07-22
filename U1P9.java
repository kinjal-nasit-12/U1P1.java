/* A bank gives 6.5% per annum interest on deposits made in that bank. Write a
program to calculate the total amount that a person will receive after the end of 5
years for a deposit of Rs.5000 for compound interest. Create necessary methods
and constructors too */
class U1P9 {

    float rate;
    double compoundInterest, netAmount;
    int n, amt;

    U1P9() {
        rate = 6.5f;
        compoundInterest = 0.0f;
        n = 5;
        amt = 5000;
    }

    public void compoundInterest() {
        compoundInterest = amt * Math.pow((1 + rate / 100), n);
        netAmount = amt + compoundInterest;
    }

    public void display() {
        System.out.println("Rate: " + rate);
        System.out.println("Year: " + n);
        System.out.println("Amount: " + amt);
        System.out.println("Compound interest: " + compoundInterest);
    }

    public static void main(String args[]) {
        U1P9 s = new U1P9();
        s.compoundInterest();
        s.display();
    }
}
