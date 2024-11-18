package advanced1;

import java.util.Scanner;

public class MinimumGoodPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int temp = 2;
            if (N % 2 == 0) {
                for (int i = 0; i < N; i += 2) {
                    System.out.print(temp + " ");
                    System.out.print((temp - 1) + " ");
                    temp += 2;
                }
            } else {
                for (int i = 0; i < N - 3; i += 2) {
                    System.out.print(temp + " ");
                    System.out.print((temp - 1) + " ");
                    temp += 2;
                }
                System.out.print((N - 1) + " " + N + " " + (N - 2));
            }
            System.out.println();
            T--;
        }
    }
}
