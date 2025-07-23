package advanced1;

import java.util.Arrays;
import java.util.Scanner;

public class Sticks {
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
            int length = 0;
            int width = 0;
            for (int i = N - 1; i > 0; i--) {
                if (A[i] == A[i - 1] && length == 0) {
                    length = A[i];
                    --i;
                } else if (A[i] == A[i - 1] && length != 0) {
                    width = A[i];
                    break;
                }
            }
            if (length != 0 && width != 0) {
                System.out.println(length * width);
            } else {
                System.out.println(-1);
            }
        }
    }
}
