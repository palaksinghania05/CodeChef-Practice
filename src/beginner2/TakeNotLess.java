package beginner2;

import java.util.Arrays;
import java.util.Scanner;

public class TakeNotLess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            Arrays.sort(A);
            int count = 1;
            int[] B = new int[N];
            int temp = 0;
            boolean flag;
            for (int i = N - 1; i > 0; i--) {
                if (A[i] == A[i - 1]) {
                    count++;
                } else {
                    B[temp] = count;
                    count = 1;
                    temp++;
                }
            }
            if (true) {
                B[temp] = count;
            }
            flag = false;
            for (int i = 0; i < N; i++) {
                if (B[i] % 2 != 0) {
                    flag = true;
                    break;
                }
            }
            System.out.println(flag ? "Marichka" : "Zenyk");
        }
    }
}
