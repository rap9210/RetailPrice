import java.util.Scanner;
public class RetailPrice {
    public static void main(String args[]) {
        String cont;
        double cost, retail, rate;
        int num_items_shipment;

        Scanner scn = new Scanner(System.in);
        rate = 2.5;
        System.out.println("Enter the number of items in the shipment.");
        num_items_shipment = scn.nextInt();



        do {
            System.out.println("Enter the Wholesale Cost of the product.");
            cost = scn.nextInt();
            retail = cost*rate;
            System.out.println("$"+retail);
            num_items_shipment -= 1;

        } while (num_items_shipment > 0);
    }
}
