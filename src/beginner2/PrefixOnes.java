package beginner2;

import java.util.Scanner;

public class PrefixOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            long j = 0;
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == '0') {
                    j = i;
                    break;
                }
            }
            int max = 0;
            for (int i = (int) j; i < N; i++) {
                int last = 0;
                while (i < N && S.charAt(i) == '1') {
                    last++;
                    i++;
                }
                max = Math.max(max, last);
            }
            System.out.println((int) j + max);
        }
    }
}
