package beginner1;

import java.util.Scanner;

public class GoodJoke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int result = 0;
            for (int i = 0; i < N; i++) {
                int c1 = sc.nextInt();
                int c2 = sc.nextInt();
            }
            for (int i = 1; i <= N; i++)
                result ^= i;
            System.out.println(result);
            T--;
        }
    }
}
