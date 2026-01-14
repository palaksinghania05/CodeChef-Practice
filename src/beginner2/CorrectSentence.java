package beginner2;

import java.util.Scanner;

public class CorrectSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int K = sc.nextInt();
            boolean flag = true;
            for (int i = 0; i < K; i++) {
                String S = sc.next();
                boolean small = S.charAt(0) >= 'a' && S.charAt(0) <= 'm';
                boolean large = !small;
                for (char ch : S.toCharArray()) {
                    if (ch >= 'N' && ch <= 'Z') {
                        if (small)
                            flag = false;
                    } else if (ch >= 'a' && ch <= 'm') {
                        if (large)
                            flag = false;
                    } else {
                        flag = false;
                    }
                }
            }
            if (flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
