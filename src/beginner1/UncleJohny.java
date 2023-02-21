package beginner1;

import java.util.Arrays;
import java.util.Scanner;

public class UncleJohny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int K = sc.nextInt();
            int position = arr[K - 1];
            Arrays.sort(arr);
            for (int i = 0; i < N; i++) {
                if (arr[i] == position) {
                    System.out.println(i + 1);
                    break;
                }
            }
            T--;
        }
    }
}
