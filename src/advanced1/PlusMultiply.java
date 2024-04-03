package advanced1;

import java.util.Scanner;

public class PlusMultiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            long[] A = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextLong();
            }
            int count1 = 0;
            int count2 = 0;
            for (int i = 0; i < N; i++) {
                if (A[i] == 2) {
                    count1++;
                } else if (A[i] == 0) {
                    count2++;
                }
            }
            int sum = (count2 * (count2 - 1) / 2) + (count1 * (count1 - 1) / 2);
            System.out.println(sum);
            T--;
        }
    }
}
