package advanced1;

import java.util.Scanner;

public class SumOfProduct1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int sum = 0;
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            long result = 0;
            for (int i = 0; i < N; i++) {
                sum = A[i];
                for (int j = i; j < N; j++) {
                    sum *= A[j];
                    if (sum == 1) {
                        result++;
                    } else {
                        break;
                    }
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
