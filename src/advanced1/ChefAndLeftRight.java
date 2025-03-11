package advanced1;

import java.util.Scanner;

public class ChefAndLeftRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String S = sc.next();
            long result = 1;
            for (int i = 0; i < S.length(); i++) {
                if (i % 2 == 0) {
                    if (S.charAt(i) == 'l') result *= 2;
                    else result = (result * 2) + 2;
                } else {
                    if (S.charAt(i) == 'l') result = (result * 2) - 1;
                    else result = (result * 2) + 1;
                }
                result %= 1000000007;
            }
            System.out.println(result);
        }
    }
}
