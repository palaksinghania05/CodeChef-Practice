package advanced1;

import java.util.Scanner;

public class LittleElephantAndPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            long[] A = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextLong();
            }
            int count = 0;
            for (int i = 0; i < N - 1; i++) {
                if (A[i] > A[i + 1])
                    count++;
            }
            int temp = 0;
            for (int i = 0; i < N - 1; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (A[i] > A[j])
                        temp++;
                }
            }
            if (count == temp)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
