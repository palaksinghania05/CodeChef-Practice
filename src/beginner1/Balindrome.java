package beginner1;

import java.util.Scanner;

public class Balindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            int flag = 1;
            for (int i = 0; i < N - 1; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (S.charAt(i) == S.charAt(j)) {
                        flag = 0;
                        break;
                    }
                }
            }
            if (flag == 0) {
                System.out.println(N - 2);
            } else {
                System.out.println(-1);
            }
        }
    }
}
