package beginner2;

import java.util.Scanner;

public class SplitPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextInt();
        while (T-- > 0) {
            long N = sc.nextInt();
            long temp = N;
            if ((N & 1) == 1) {
                System.out.print(N + " ");
                temp = N - 1;
            }
            for (long i = 1; i < (N / 2 + 1); i++) {
                System.out.print(i + " " + (temp) + " ");
                temp--;
            }
            System.out.println();
        }
    }
}
