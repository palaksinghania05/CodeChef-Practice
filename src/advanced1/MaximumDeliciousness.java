package advanced1;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumDeliciousness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int L = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++)
                arr[i] = sc.nextInt();
            Arrays.sort(arr);
            int temp = N - L;
            long result = 0;
            while (temp >= 0) {
                result = result + arr[temp];
                temp -= K;
            }
            System.out.println(result);
            T--;
        }
    }
}
