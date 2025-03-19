package advanced1;

import java.util.Scanner;

public class DeputyChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            int[] brr = new int[N];
            for (int i = 0; i < N; i++)
                arr[i] = sc.nextInt();
            for (int i = 0; i < N; i++)
                brr[i] = sc.nextInt();
            int result = -1;
            for (int i = 0; i < N; i++) {
                int temp1 = (i == 0 ? N - 1 : i - 1);
                int temp2 = (i == N - 1 ? 0 : i + 1);
                if (brr[i] > arr[temp1] + arr[temp2]) {
                    result = Math.max(result, brr[i]);
                }
            }
            System.out.println(result);
        }
    }
}
