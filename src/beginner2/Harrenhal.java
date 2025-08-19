package beginner2;

import java.util.Scanner;

public class Harrenhal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String S = sc.next();
            StringBuilder stringBuilder = new StringBuilder(S);
            if (S.indexOf('a') == -1 || S.indexOf('b') == -1)
                System.out.println("1");
            else {
                if (S.equals(String.valueOf(stringBuilder.reverse())))
                    System.out.println("1");
                else
                    System.out.println("2");
            }
        }
    }
}
