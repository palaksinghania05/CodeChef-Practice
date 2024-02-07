package advanced1;

import java.util.Scanner;

public class ChefAndMemoryLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            long count = arr[0];
            for (int k = 0; k < N - 1; k++) {
                if (arr[k] < arr[k + 1]) {
                    count = count + (arr[k + 1] - arr[k]);
                }
            }
            System.out.println(count);
            T--;
        }
    }
}
