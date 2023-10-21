package advanced1;

import java.util.Scanner;

public class ChefAndString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            String S = sc.next();
            String s1 = S.substring(1) + S.charAt(0);
            String s2 = S.substring(S.length() - 1) + S.substring(0, S.length() - 1);
            System.out.println((s1.equals(s2)) ? "YES" : "NO");
            T--;
        }
    }
}
