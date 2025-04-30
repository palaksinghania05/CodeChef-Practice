package beginner;

import java.util.Scanner;

public class DifficultyRatingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            boolean flag = false;
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            for (int j = 1; j < N; j++) {
                if (A[j] < A[j - 1]) {
                    flag = true;
                    break;
                }
            }
            System.out.println(!flag ? "Yes" : "No");
        }
    }
}
