package beginner2;

import java.util.Scanner;

public class WhoDaresToBeAMillionaire {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            char[] s1 = sc.next().toCharArray();
            char[] s2 = sc.next().toCharArray();
            int temp = 0;
            int[] A = new int[N + 1];
            for (int i = 0; i <= N; i++)
                A[i] = sc.nextInt();
            int result = 0;
            for (int i = 0; i < N; i++) {
                if (s1[i] == s2[i]) {
                    temp++;
                }
            }
            if (temp == 0)
                result = A[0];
            else if (temp == N)
                result = A[N];
            else {
                for (int i = 0; i <= temp; i++) {
                    result = Math.max(result, A[i]);
                }
            }
            System.out.println(result);
        }
    }
}
