/* A shop during festival season offers a discount 10% for purchase made up to
Rs.1,000,12% for purchase value of Rs.1,000 or more up to Rs 1,500 and 15% for
purchase value of Rs.1,500 or more. Write a program to implement the above
scheme for a given sales and print out the sales and print out the sales value,
discount and net amount payable by a customer. Create necessary methods and
constructors. */
class U1P8 {

    int pAmount;
    float discount, netAmount;

    U1P8(int amt) {
        pAmount = amt;
        discount = 0.0f;
        netAmount = 0.0f;
    }

    public void calculateDiscount() {
        if (pamount < 1000) {
            discount = pAmount * .10f;
        } else if (pamount >= 1000) {
            discount = pAmount * .12f;
        } else {
            discount = pAmount * .15f;
        }
        netAmount = pAmount - discount;
    }

    public void display() {
        System.out.println("Purchase amount: " + pAmount);
        System.out.println("Discount: " + discount);
        System.out.println("Net amount: " + netAmount);
    }

    public static void main(String args[]) {
        U1P8 p = new U1P8(500);
        p.calculateDiscount();
        p.display();
    }
}
