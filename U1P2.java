class U1P2 {

    public static void main(String args[]) {
        int amt = Integer.parseInt(args[0]);
        float rate = Float.parseFloat(args[1]);
        int y = 5;
        float si = 0.0f;
        si = (amt * rate * y) / 100;
        float netamt = amt + si;
        float emi = netamt / 12;
        System.out.println("Total amount: " + amt);
        System.out.println("Rate: " + rate);
        System.out.println("year: " + y);
        System.out.println("Simple Interest: " + si);
        System.out.println("Net Amount: " + netamt);
        System.out.println("EMI: " + emi);
    }
}
