package beginner2;

import java.util.Scanner;

public class TotalScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt(), K = sc.nextInt();
            int[] A = new int[K];
            long result = 0;
            for (int i = 0; i < K; i++) {
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                String S = sc.next();
                for (int j = 0; j < K; j++) {
                    if (S.charAt(j) == '1')
                        result += A[j];
                }
                System.out.println(result);
                result = 0;
            }
        }
    }
}
