package advanced1;

import java.util.Scanner;

public class LiftRequests {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int Q = sc.nextInt();
            long ans = 0;
            int initial_position = 0;
            for (int i = 0; i < Q; i++) {
                int f = sc.nextInt();
                int d = sc.nextInt();
                ans += Math.abs(initial_position - f);
                ans += Math.abs(d - f);
                initial_position = d;
            }
            System.out.println(ans);
            T--;
        }
    }
}
