package beginner1;

import java.util.Scanner;

public class ChefAndStockPrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int S = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            double increasePrice = S + ((double) (C * S) / 100);
            if (A <= increasePrice && B >= increasePrice)
                System.out.println("Yes");
            else
                System.out.println("No");
            T--;
        }
    }
}
