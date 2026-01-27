package beginner2;

import java.util.Scanner;

public class PlusleAndMinunOnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            long sum = 0;
            int temp1 = 1000000000, temp2 = -1;
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                A[i] = Math.abs(A[i]);
                if (i % 2 == 0) {
                    sum += A[i];
                    temp1 = Math.min(temp1, A[i]);
                } else {
                    sum -= A[i];
                    temp2 = Math.max(temp2, A[i]);
                }
            }
            if (temp1 < temp2) {
                sum -= (temp1 * 2L);
                sum += (temp2 * 2L);
            }
            System.out.println(sum);
        }
    }
}
