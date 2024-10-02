package advanced1;

import java.util.Scanner;

public class Tickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T > 0) {
            String S = sc.nextLine();
            boolean flag = S.charAt(0) != S.charAt(1);
            for (int i = 0; i < S.length(); i += 2)
                if (S.charAt(i) != S.charAt(0)) {
                    flag = false;
                    break;
                }
            for (int i = 1; i < S.length(); i += 2)
                if (S.charAt(i) != S.charAt(1)) {
                    flag = false;
                    break;
                }
            if (flag)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
