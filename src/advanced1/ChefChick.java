package advanced1;

import java.util.Scanner;

public class ChefChick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextInt();
            }
            int result = arr[0];
            for (int j = 1; j < N; j++) {
                result = Math.min(result, arr[j]);
            }
            System.out.println(result);
            T--;
        }
    }
}
