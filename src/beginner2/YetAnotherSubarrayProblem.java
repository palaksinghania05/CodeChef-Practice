package beginner2;

import java.util.Scanner;

public class YetAnotherSubarrayProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int K = 0;
            for (int i = 0; i < N; i++) {
                K += 2;
                System.out.print(K + " ");
            }
            System.out.println();
        }
    }
}
