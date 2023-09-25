package beginner;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int j = 0; j < N; j++) {
                int ele = sc.nextInt();
                arr[j] = ele;
            }
            int max = arr[0] + arr[N - 1];
            int sum = 0;
            for (int j = 0; j < N - 1; j++) {
                int temp = arr[j] + arr[j + 1];
                if (temp > sum) {
                    sum = temp;
                }
            }
            System.out.println(Math.max(max, sum));
            T--;
        }
    }
}
