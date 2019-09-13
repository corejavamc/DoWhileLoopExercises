/*
 * Your client owns an import business and client needs to calculate the retail price of products each
 * time client receives a shipment.  The number of items differ for each shipment.
 * You and your partner are commission to write a program to compute retail price of each item of a shipment.
 * And you are provided with the following formula:
 *      Retail Price = Wholesale Cost X 2.5
 *
 */


import java.util.Scanner;

public class RetailPrice {
    public static void main(String args[]) {
        String cont;
        double cost, retail, rate = 2.5;

        Scanner keybd = new Scanner(System.in);

        do {
            System.out.println("Enter a wholesale cost or 0 to quit.");
            cost = keybd.nextDouble();

            if (cost != 0) {
                retail = cost * 2.5;
                System.out.printf("Your retail price is $%.2f\n", retail);
            }
            else
                break;
        } while (true);

    }
}
