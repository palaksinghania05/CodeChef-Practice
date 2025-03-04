package advanced1;

import java.util.Scanner;

public class GridFillProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            if (N == 2) {
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        System.out.print(-1 + " ");
                    }
                    System.out.println();
                }
            } else {
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        if (i == j) {
                            System.out.print(-1 + " ");
                        } else {
                            System.out.print(1 + " ");
                        }
                    }
                    System.out.println();
                }
            }
        }
    }
}
