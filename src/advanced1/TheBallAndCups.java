package advanced1;

import java.util.Scanner;

public class TheBallAndCups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int C = sc.nextInt();
            int Q = sc.nextInt();
            for (int i = 0; i < Q; i++) {
                int L = sc.nextInt();
                int R = sc.nextInt();
                if (C <= R && C >= L)
                    C = R - C + L;
            }
            System.out.println(C);
            T--;
        }
    }
}
