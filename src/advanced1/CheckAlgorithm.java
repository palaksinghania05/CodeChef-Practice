package advanced1;

import java.util.Scanner;

public class CheckAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            String S = sc.next();
            StringBuilder result = new StringBuilder();
            char ch = S.charAt(0);
            int curLen = 0;
            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) != ch) {
                    result.append(ch).append(curLen);
                    ch = S.charAt(i);
                    curLen = 1;
                } else {
                    curLen++;
                }
                if (i == S.length() - 1) {
                    result.append(ch).append(curLen);
                }
            }
            if (result.length() < S.length()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            T--;
        }
    }
}
