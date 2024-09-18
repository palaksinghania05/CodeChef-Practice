package advanced1;

import java.util.Scanner;

public class PermutationAndMedian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int temp1 = N;
            int temp2 = 1;
            if (N % 2 == 0) {
                for (int i = 1; i <= N; i += 2) {
                    System.out.print(temp1 + " " + temp2 + " ");
                    temp1--;
                    temp2++;
                }
            } else {
                for (int i = 1; i < N; i += 2) {
                    System.out.print(temp1 + " " + temp2 + " ");
                    temp1--;
                    temp2++;
                }
                System.out.print(temp1 + " ");
            }
            System.out.println();
            T--;
        }
    }
}
