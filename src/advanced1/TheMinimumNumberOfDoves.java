package advanced1;

import java.util.Arrays;
import java.util.Scanner;

public class TheMinimumNumberOfDoves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            int sum = 0;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            Arrays.sort(arr);
            System.out.println(sum - N * arr[0]);
        }
    }
}
