package beginner2;

import java.util.Scanner;

public class SplittingBalls {
    static long[] fl = new long[1000001];

    public static void main(String[] args) {
        long m = 1000000007;
        fl[0] = 1;
        fl[1] = 1;
        for (int i = 2; i < 1000001; i++) {
            fl[i] = (i * fl[i - 1]) % m;
        }
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt(), temp = 0;
            for (int i = 0; i < N; i++) {
                temp += (int) fl[sc.nextInt()];
                temp %= (int) m;
            }
            System.out.println(temp % m);
        }
    }
}
