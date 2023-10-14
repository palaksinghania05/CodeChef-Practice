package advanced1;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int sum = 0;
            int N = sc.nextInt();
            int K = sc.nextInt();
            int V = sc.nextInt();
            for (int i = 0; i < N; i++) {
                int temp = sc.nextInt();
                sum = sum + temp;
            }
            int value = ((N + K) * V) - sum;
            if (value <= 0)
                System.out.println(-1);
            else {
                int check_decimal = (((N + K) * V) - sum) % K;
                if (check_decimal == 0) {
                    System.out.println((((N + K) * V) - sum) / K);
                } else {
                    System.out.println("-1");
                }
            }
            T--;
        }
    }
}
