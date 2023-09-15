package beginner1;

import java.util.Scanner;

public class MixingExtraordinaire {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            long[] arr = new long[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextLong();
            }
            long result = 0;
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    result = result + arr[i] * arr[j];
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
