package beginner;

import java.util.Scanner;

public class TotalExpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t > 0) {
                long quantity = sc.nextLong();
                long price = sc.nextLong();
                if (quantity > 1000) {
                    double order = quantity * price;
                    double discount = (10 * order) / 100;
                    double total = order - discount;
                    System.out.println(total);
                } else {
                    double order = quantity * price;
                    System.out.println(order);
                }
                t--;
            }
        }
    }
}
