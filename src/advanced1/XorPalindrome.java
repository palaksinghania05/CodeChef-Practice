package advanced1;

import java.util.Scanner;

public class XorPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            int one = 0;
            int zero = 0;
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == '1') {
                    one++;
                } else {
                    zero++;
                }
            }
            if (one != zero && one % 2 != 0 && zero % 2 != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
            T--;
        }
    }
}
