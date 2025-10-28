package beginner2;

import java.util.Scanner;

public class FriendOrGirlfriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            char ch = sc.next().charAt(0);
            long temp = -1;
            long result = 0;
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == ch) {
                    temp = i;
                }
                if (temp != -1) {
                    result += (temp + 1);
                }
            }
            System.out.println(result);
        }
    }
}
