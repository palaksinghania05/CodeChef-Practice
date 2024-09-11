package advanced1;

import java.util.Scanner;

public class PermutationCreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            if (N < 5 && N != 4)
                System.out.println(-1);
            else if (N == 4)
                System.out.println("2 4 1 3");
            else {
                for (int i = 1; i <= N; i++) {
                    if (i % 2 != 0)
                        System.out.print(i + " ");
                }
                for (int i = 2; i <= N; i++) {
                    if (i % 2 == 0)
                        System.out.print(i + " ");
                }
            }
            T--;
        }
    }
}
