/* A shop during festival season offers a discount 10% for purchase made up to
Rs.1,000,12% for purchase value of Rs.1,000 or more up to Rs 1,500 and 15% for
purchase value of Rs.1,500 or more. Write a program to implement the above
scheme for a given sales and print out the sales and print out the sales value,
discount and net amount payable by a customer. Create necessary methods and
constructors. */
class U1P8 {

    int pamt;
    float dis, net_amount;

    U1P8(int amt) {
        pamt = amt;
        dis = 0.0f;
        net_amount = 0.0f;
    }

    public void Cal_disc() {
        if (pamt < 1000) {
            dis = pamt * .10f;
        } else if (pamt >= 1000) {
            dis = pamt * .12f;
        } else {
            dis = pamt * .15f;
        }
        net_amount = pamt - dis;
    }

    public void display() {
        System.out.println("Purchase amount: " + pamt);
        System.out.println("Discount: " + dis);
        System.out.println("Net amount: " + net_amount);
    }

    public static void main(String args[]) {
        U1P8 p1 = new U1P8(500);
        p1.Cal_disc();
        p1.display();
    }
}
