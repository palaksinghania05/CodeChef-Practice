package advanced1;

import java.util.Scanner;

public class Brackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            String s = sc.next();
            int balance = 0;
            int max_balance = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') balance = balance + 1;
                if (s.charAt(i) == ')') balance = balance - 1;
                max_balance = Math.max(max_balance, balance);
            }
            for (int i = 0; i < max_balance; i++) {
                System.out.print("(");
            }
            for (int i = 0; i < max_balance; i++) {
                System.out.print(")");
            }
            System.out.println();
            T--;
        }
    }
}
