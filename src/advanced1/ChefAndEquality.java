package advanced1;

import java.util.Arrays;
import java.util.Scanner;

public class ChefAndEquality {
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
            int count = 1;
            int temp = 1;
            for (int i = 0; i < N - 1; i++) {
                if (A[i] == A[i + 1])
                    count++;
                else
                    count = 1;
                temp = Math.max(temp, count);
            }
            System.out.println(N - temp);
            T--;
        }
    }
}
