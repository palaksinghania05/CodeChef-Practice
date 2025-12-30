package beginner2;

import java.util.Scanner;

public class AntiPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            int[] A = new int[26];
            for (char ch : S.toCharArray()) {
                A[ch - 'a']++;
            }
            int odd = 0, even = 0;
            for (int i : A) {
                if (i % 2 == 0) {
                    if (i != 0) even++;
                } else {
                    odd++;
                }
            }
            if (odd > 1) {
                System.out.println(0);
            } else if (odd == 1 && even == 0) {
                System.out.println(2);
            } else {
                System.out.println(1);
            }
        }
    }
}
