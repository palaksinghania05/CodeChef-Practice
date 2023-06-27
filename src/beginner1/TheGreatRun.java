package beginner1;

import java.util.Scanner;

public class TheGreatRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int A = sc.nextInt();
            int K = sc.nextInt();
            int[] arr = new int[A];
            int sum = 0;
            for (int i = 0; i < A; i++) {
                arr[i] = sc.nextInt();
                if (i < K) {
                    sum += arr[i];
                }
            }
            int max = sum;
            int i = 0;
            int j = K;
            while (j < A) {
                sum -= arr[i];
                i++;
                sum += arr[j];
                j++;
                if (sum > max) {
                    max = sum;
                }
            }
            System.out.println(max);
            T--;
        }
    }
}
