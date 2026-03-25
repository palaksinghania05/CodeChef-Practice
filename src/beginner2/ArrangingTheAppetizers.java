package beginner2;

import java.util.Scanner;

public class ArrangingTheAppetizers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int K = sc.nextInt();
            int N = 1 << K;
            String S = sc.next();
            char[] ch = S.toCharArray();
            char[] R = new char[N];
            for (int i = 0; i < N; i++) {
                int idx = i;
                int result = 0;
                for (int j = 0; j < K; j++) {
                    result = result << 1;
                    result = result | (idx & 1);
                    idx = idx >> 1;
                }
                R[result] = ch[i];

            }
            String str = new String(R);
            System.out.println(str);
        }
    }
}
