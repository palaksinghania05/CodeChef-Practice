package advanced1;

import java.util.Arrays;
import java.util.Scanner;

public class TopBatsmen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int[] fact = new int[]{1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800};
            int[] arr = new int[11];
            for (int i = 0; i < 11; i++) {
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            int count1 = 0, count2 = 0;
            Arrays.sort(arr);
            for (int i = 10; i >= 0; i--) {
                if (arr[i] == arr[11 - k]) {
                    if (i < 11 - k) {
                        count2++;
                    }
                    count1++;
                }
            }
            int numerator = fact[count1], denominator = fact[count2] * fact[count1 - count2];
            System.out.println(numerator / denominator);
            T--;
        }
    }
}
