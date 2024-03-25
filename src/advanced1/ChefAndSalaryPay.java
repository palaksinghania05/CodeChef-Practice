package advanced1;

import java.util.Scanner;

public class ChefAndSalaryPay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            String S = sc.next();
            int count = 1, max = 0;
            for (int i = 0; i < S.length() - 1; i++) {
                if (S.charAt(i) == '1' && S.charAt(i + 1) == '1')
                    count++;
                else
                    count = 1;
                max = Math.max(count, max);
            }
            S = S.replaceAll("0", "");
            System.out.println(S.length() * X + max * Y);
            T--;
        }
    }
}
