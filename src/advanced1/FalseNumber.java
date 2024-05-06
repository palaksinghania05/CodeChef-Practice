package advanced1;

import java.util.Scanner;

public class FalseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            String S = sc.next();
            if (S.charAt(0) == '1') {
                S = '0' + S.substring(1);
                S = '1' + S;
            } else {
                S = '1' + S;
            }
            System.out.println(S);
            T--;
        }
    }
}
