package advanced1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ExclusionInclusion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            Integer[] arr = new Integer[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr, Collections.reverseOrder());
            long[] result = new long[N];
            long sum = 0;
            for (int i = 0; i < N; i++) {
                sum += arr[i];
                result[i] = sum;
            }
            for (int i = N - 1; i >= 0; i--) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
            T--;
        }
    }
}
