package advanced1;

import java.util.Scanner;

public class ChefAndStreetFood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int result = 0;
            for (int i = 0; i < N; i++) {
                int S = sc.nextInt();
                int P = sc.nextInt();
                int V = sc.nextInt();
                int temp = (P / (S + 1));
                int profit = temp * V;
                result = Math.max(result, profit);
            }
            System.out.println(result);
            T--;
        }
    }
}
