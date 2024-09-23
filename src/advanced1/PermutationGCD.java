package advanced1;

import java.util.Scanner;

public class PermutationGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            if (X < N)
                System.out.println(-1);
            else {
                int temp = X - N + 1;
                System.out.print(temp + " ");
                for (int i = 1; i <= N; i++) {
                    if (i != temp)
                        System.out.print(i + " ");
                }
                System.out.println();
            }
            T--;
        }
    }
}
