package advanced1;

import java.util.Scanner;

public class FadedPalindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            String S = sc.next();
            int N = S.length();
            boolean flag = true;
            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) == S.charAt(N - 1 - i) || S.charAt(i) == '.' || S.charAt(N - 1 - i) == '.')
                    continue;
                else
                    flag = false;
            }
            if (flag) {
                StringBuilder result = new StringBuilder();
                for (int i = 0; i < S.length(); i++) {
                    if (S.charAt(i) == '.' && S.charAt(N - 1 - i) == '.')
                        result.append('a');
                    else if (S.charAt(i) == '.')
                        result.append(S.charAt(N - 1 - i));
                    else
                        result.append(S.charAt(i));
                }
                System.out.println(result.toString());
            } else
                System.out.println(-1);
            T--;
        }
    }
}
