package beginner1;

import java.util.Arrays;
import java.util.Scanner;

public class ChefAndEid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int minDiff = Integer.MAX_VALUE;
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            for (int i = 0; i < N - 1; i++) {
                int diff = arr[i + 1] - arr[i];
                minDiff = Math.min(diff, minDiff);
            }
            System.out.println(minDiff);
            T--;
        }
    }
}
