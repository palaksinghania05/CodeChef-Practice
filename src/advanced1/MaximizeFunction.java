package advanced1;

import java.util.Arrays;
import java.util.Scanner;

public class MaximizeFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            long X = arr[0];
            long Y = arr[N - 1];
            long Z = arr[1];
            System.out.println(Math.abs(X - Y) + Math.abs(Y - Z) + Math.abs(Z - X));
            T--;
        }
    }
}
