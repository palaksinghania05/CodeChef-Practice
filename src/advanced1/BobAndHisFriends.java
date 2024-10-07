package advanced1;

import java.util.Scanner;

public class BobAndHisFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long[] arr = new long[N];
            long temp = Long.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextLong();
            }
            for (int i = 0; i < N; i++) {
                temp = Math.min(temp, Math.abs(a - arr[i]) + Math.abs(b - arr[i]));
            }
            System.out.println(c + temp);
            T--;
        }
    }
}
