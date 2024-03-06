package advanced1;

import java.util.Scanner;

public class PalindromicSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            String A = sc.next();
            String B = sc.next();
            boolean flag = false;
            if (A.length() <= B.length()) {
                for (int i = 0; i < A.length(); i++) {
                    if (B.contains((A.substring(i, i + 1)))) {
                        flag = true;
                        break;
                    }
                }
            } else {
                for (int i = 0; i < B.length(); i++) {
                    if (A.contains((B.substring(i, i + 1)))) {
                        flag = true;
                        break;
                    }
                }
            }
            if (flag)
                System.out.println("Yes");
            else
                System.out.println("No");
            T--;
        }
    }
}
