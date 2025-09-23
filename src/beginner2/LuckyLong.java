package beginner2;

import java.util.Scanner;

public class LuckyLong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String S = sc.next();
            int result = 0;
            for (int i = 0; i < S.length(); i++) {
                char ch = S.charAt(i);
                if (ch != '4' && ch != '7') {
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}
