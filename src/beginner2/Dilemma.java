package beginner2;

import java.util.Scanner;

public class Dilemma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String S = sc.next();
            int ones = 0;
            for (int j = 0; j < S.length(); j++) {
                if (S.charAt(j) == '1') {
                    ones++;
                }
            }
            if (ones % 2 != 0) {
                System.out.println("WIN");
            } else {
                System.out.println("LOSE");
            }
        }
    }
}
