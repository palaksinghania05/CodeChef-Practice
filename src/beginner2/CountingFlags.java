package beginner2;

import java.util.Scanner;

public class CountingFlags {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long N = sc.nextLong();
            long result = 2 * N * (N - 1) * (N - 1) +
                    N * (N - 1) * (N - 2) +
                    2 * N * (N - 1) * (N - 2) * (N - 2);
            System.out.print(result + "\n");
        }
    }
}
