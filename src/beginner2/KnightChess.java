package beginner2;

import java.util.Scanner;

public class KnightChess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            long[][] knights = new long[N][2];
            for (int i = 0; i < N; i++) {
                knights[i][0] = sc.nextLong();
                knights[i][1] = sc.nextLong();
            }
            long row = sc.nextLong();
            long col = sc.nextLong();
            long[][] moves = new long[8][2];
            int[] t_rows = {2, 2, -2, -2, 1, 1, -1, -1};
            int[] t_cols = {1, -1, 1, -1, 2, -2, 2, -2};
            for (int i = 0; i < 8; i++) {
                moves[i][0] = row + t_rows[i];
                moves[i][1] = col + t_cols[i];
            }
            boolean result = false;
            for (long[] knight : knights) {
                for (long[] move : moves) {
                    if (knight[0] == move[0] && knight[1] == move[1]) {
                        result = true;
                        break;
                    }
                }
            }
            if (result)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
