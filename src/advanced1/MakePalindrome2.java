package advanced1;

import java.util.Scanner;

public class MakePalindrome2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            int ones = 0, zeros = 0;
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == '1') ones++;
                else zeros++;
            }
            if (ones >= zeros) {
                for (int i = 0; i < ones; i++) {
                    System.out.print("1");
                }
            } else {
                for (int i = 0; i < zeros; i++) {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
