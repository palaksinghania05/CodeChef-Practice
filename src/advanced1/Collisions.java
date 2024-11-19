package advanced1;

import java.util.Scanner;

public class Collisions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            String[] s = new String[N];
            for (int i = 0; i < N; i++) {
                s[i] = sc.next();
            }
            int result = 0;
            for (int i = 0; i < M; i++) {
                int c = 0;
                for (int j = 0; j < N; j++) {
                    if (s[j].charAt(i) == '1') {
                        c++;
                    }
                }
                if (c > 1)
                    result += (c * (c - 1)) / 2;
            }
            System.out.println(result);
            T--;
        }
    }
}
