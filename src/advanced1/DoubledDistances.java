package advanced1;

import java.util.Arrays;
import java.util.Scanner;

public class DoubledDistances {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            Arrays.sort(A);
            boolean flag = false;
            for (int i = 1; i < N - 1; i += 2) {
                int temp1 = A[i] - A[i - 1];
                int temp2 = A[i + 1] - A[i];
                if (temp1 == 2 * temp2 || 2 * temp1 == temp2)
                    flag = true;
                else {
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.println("Yes");
            else
                System.out.println("No");
            T--;
        }
    }
}
