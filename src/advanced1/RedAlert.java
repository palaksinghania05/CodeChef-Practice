package advanced1;

import java.util.Scanner;

public class RedAlert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int D = sc.nextInt();
            int H = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int temp = 0;
            int result = 0;
            for (int j : arr) {
                if (j != 0) {
                    temp += j;
                    if (temp > H) {
                        result++;
                    }
                }
                if (j == 0) {
                    if (temp < D) {
                        temp = 0;
                    } else {
                        temp -= D;
                    }
                }
            }
            if (result > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            T--;
        }
    }
}
