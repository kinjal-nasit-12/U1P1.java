/* A car accessories shop assigns code 1 to seat covers, 2 to steering wheel covers,
3 to car lighting and 4 for air purifiers. All other items have code 5 or more. While
selling the goods, a sales tax of 2% to seat covers ,3% to steering wheel covers,
4% to car lighting, 2.5% to air purifiers and 1.2% for all other items is charged.
A list containing the product code and price is given for making a bill.
Write a java program using switch statements to prepare a bill */
import java.util.Scanner;

class U1P3 {

    public static void main(String args[]) {
        System.out.println("1.Seat cover-15000rs.");
        System.out.println("2.Steering wheel covers-15000rs.");
        System.out.println("3.car lighting-7000rs.");
        System.out.println("4.Air purifiers-500rs.");
        System.out.println("5.other items-enter amount.");
        System.out.println("Enter your choice: ");
        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();
        double amt;
        switch (choice) {
            case 1:
                amt = 15000 + (15000 * 2) / 100;
                System.out.println("seat cover total charge are: " + amt);
                break;
            case 2:
                amt = 1500 + (1500 * 3) / 100;
                System.out.println("steering wheel cover total charges are: " + amt);
                break;
            case 3:
                amt = 7000 + (500 * 2.5) / 100;
                System.out.println("car lighting total charges are: " + amt);
                break;
            case 4:
                amt = 500 + (500 * 2.5) / 100;
                System.out.println("Air purifiers total charges are: " + amt);
                break;
            case 5:
                System.out.println("enter amount: ");
                amt = s.nextFloat();

                System.out.println("enter item: ");
                String name = s.next();
                amt = amt + (amt * 1.2) / 100;
                System.out.println(name + "total charges are: " + amt);
                break;
            default:
                System.out.println("wrong choice entered.");
        }
    }
}
