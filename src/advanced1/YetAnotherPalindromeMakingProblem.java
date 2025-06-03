package advanced1;

import java.util.Arrays;
import java.util.Scanner;

public class YetAnotherPalindromeMakingProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            String str = sc.next();
            char[] arr = str.toCharArray();
            StringBuilder s1 = new StringBuilder();
            StringBuilder s2 = new StringBuilder();
            for (int i = 0; i < N; i++) {
                if (i % 2 == 0) {
                    s1.append(arr[i]);
                } else {
                    s2.append(arr[i]);
                }
            }
            char[] p1 = s1.toString().toCharArray();
            char[] p2 = s2.toString().toCharArray();
            Arrays.sort(p1);
            Arrays.sort(p2);
            boolean pass = true;
            for (int i = 0; i < s1.length(); i++) {
                if (p1[i] == p2[i]) {
                    continue;
                } else {
                    pass = false;
                }
            }
            if (pass)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
