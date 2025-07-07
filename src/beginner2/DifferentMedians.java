package beginner2;

import java.util.Scanner;

public class DifferentMedians {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int i = 1;
            int j = N;
            int temp = 0;
            while (i <= j) {
                A[temp++] = j--;
                if (temp < N) {
                    A[temp++] = i++;
                }
            }
            for (int k = 0; k < N; k++) {
                System.out.print(A[k] + " ");
            }
            System.out.println();
        }
    }
}
