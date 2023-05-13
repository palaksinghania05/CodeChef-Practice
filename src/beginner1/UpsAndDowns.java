package beginner1;

import java.util.Arrays;
import java.util.Scanner;

public class UpsAndDowns {
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
            int start = 0;
            int end = N - 1;
            while (start < end) {
                System.out.print(arr[start] + " ");
                System.out.print(arr[end] + " ");
                start++;
                end--;
            }
            if (N % 2 == 0)
                System.out.println();
            else
                System.out.println(arr[start]);
            T--;
        }
    }
}
