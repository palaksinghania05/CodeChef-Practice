package beginner1;

import java.util.Scanner;

public class PseudoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int count = 0;
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < N - 1; i++) {
                if (A[i] > A[i + 1]) {
                    int temp = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = temp;
                    break;
                }
            }
            for (int i = 0; i < N - 1; i++) {
                if (A[i] > A[i + 1]) {
                    count++;
                    break;
                }
            }
            if (count == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
