package beginner1;

import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] point = new int[N];
            int[] foul = new int[N];
            for (int i = 0; i < N; i++) {
                point[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                foul[i] = sc.nextInt();
            }
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < N; i++) {
                int score = point[i] * 20 - foul[i] * 10;
                if (score < 0)
                    max = Math.max(max, 0);
                else
                    max = Math.max(max, score);
            }
            System.out.println(max);
            T--;
        }
    }
}
