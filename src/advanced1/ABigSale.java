package advanced1;

import java.util.Scanner;

public class ABigSale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            double result = 0.0;
            for (int i = 0; i < N; i++) {
                double price = sc.nextDouble();
                double quantity = sc.nextDouble();
                double discount = sc.nextDouble();
                if (discount == 0.0)
                    continue;
                price *= quantity;
                double temp = price + price * (0.01 * discount);
                result += (price - (temp - (temp) * (0.01 * discount)));
            }
            System.out.println(result);
            T--;
        }
    }
}
