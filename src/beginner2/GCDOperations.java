package beginner2;

import java.util.Scanner;

public class GCDOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            boolean flag = true;
            for (int i = 0; i < N; i++) {
                if ((i + 1) % A[i] != 0 || A[i] > (i + 1)) {
                    flag = false;
                    break;
                }

            }
            System.out.println(flag ? "YES" : "NO");
        }
    }
}
