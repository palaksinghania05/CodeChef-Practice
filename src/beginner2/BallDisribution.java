package beginner2;

import java.util.Scanner;

public class BallDisribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            long ele = 0;
            for (int i = 0; i < M; i++) {
                ele += sc.nextInt();
            }
            long result = Math.max(0, ele - (long) N * (M - 1));
            System.out.println(result);
        }
    }
}
