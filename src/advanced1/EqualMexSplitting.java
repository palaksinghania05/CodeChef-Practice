package advanced1;

import java.util.Scanner;

public class EqualMexSplitting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            int temp1 = 0, temp2 = 0;
            for (int i = 0; i < N; i++) {
                if (A[i] == 0)
                    temp1++;
                else
                    temp2++;
            }
            System.out.println(Math.max(temp1, temp2));
        }
    }
}
