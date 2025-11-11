package beginner2;

import java.util.Arrays;
import java.util.Scanner;

public class ChefAndEasyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++)
                A[i] = sc.nextInt();
            Arrays.sort(A);
            long result = 0;
            for (int i = N - 1; i >= 0; i -= 2) {
                result += A[i];
            }
            System.out.println(result);
        }
    }
}
