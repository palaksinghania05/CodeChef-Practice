package beginner1;

import java.util.Scanner;

public class DannyWantsToKnow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }
        for (int i = 0; i < Q; i++) {
            int L = sc.nextInt();
            int R = sc.nextInt();
            long sum = 0;
            for (int j = L - 1; j < R; j++) {
                sum += (long) A[j] * B[j];
            }
            System.out.println(sum);
        }
    }
}
