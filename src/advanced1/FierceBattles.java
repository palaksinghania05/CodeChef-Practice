package advanced1;

import java.util.Scanner;

public class FierceBattles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] arr1 = new int[101];
            int[] arr2 = new int[101];
            for (int i = 0; i < N; i++) {
                int C = sc.nextInt();
                int L = sc.nextInt();
                arr1[L] += C;
            }
            for (int i = 0; i < M; i++) {
                int c = sc.nextInt();
                int l = sc.nextInt();
                arr2[l] += c;
            }
            int result = 0;
            for (int i = 1; i <= 100; i++) {
                if (arr2[i] > arr1[i]) {
                    result += arr2[i] - arr1[i];
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
