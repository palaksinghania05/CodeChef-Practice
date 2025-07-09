package beginner2;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();

            }
            Arrays.sort(arr);
            if (arr[0] + arr[N - 1] <= K || N == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
