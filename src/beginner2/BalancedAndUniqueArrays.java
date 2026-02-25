package beginner2;

import java.util.Scanner;

public class BalancedAndUniqueArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            if (N % 4 != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                int temp1 = N / 4, temp2 = 2 * N / 4, temp3 = 3 * N / 4;
                for (int i = 1; i <= temp1; i++) {
                    System.out.print(i + " ");
                }
                for (int i = temp3 + 1; i <= N; i++) {
                    System.out.print(i + " ");
                }

                System.out.println();

                for (int i = temp1 + 1; i <= temp3; i++) {
                    System.out.print(i + " ");
                }

                System.out.println();
            }
        }
    }
}
