package advanced1;

import java.util.Scanner;

public class PhonePrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] prices = new int[N];
            for (int i = 0; i < N; i++) {
                prices[i] = sc.nextInt();
            }
            int result = 1, flag = 0, temp = 0;
            int min = prices[0];
            for (int i = 1; i < 5; i++) {
                if (prices[i] < min) {
                    result++;
                    min = prices[i];
                }
            }
            for (int i = 5; i < N; i++) {
                for (int j = flag; j < i; j++) {
                    if (prices[i] < prices[j]) temp++;
                    else {
                        break;
                    }
                }
                flag++;
                if (temp == 5)
                    result++;
                temp = 0;
            }
            System.out.println(result);
            T--;
        }
    }
}
