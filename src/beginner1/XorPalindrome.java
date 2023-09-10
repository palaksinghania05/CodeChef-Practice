package beginner1;

import java.util.Scanner;

public class XorPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String s = sc.next();
            int flag = 0;
            for (int j = 0; j < N / 2; j++) {
                if (s.charAt(j) != s.charAt(N - j - 1)) {
                    flag++;
                }
            }
            System.out.println((flag + 1) / 2);
            T--;
        }
    }
}
