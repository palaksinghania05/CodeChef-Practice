package beginner2;

import java.util.Scanner;

public class StringGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {
            int N = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int zero = 0, one = 0;
            for (int i = 0; i < N; i++) {
                if (s.charAt(i) == '1') {
                    one++;

                } else {
                    zero++;
                }
            }
            int temp = Math.min(zero, one);
            if (temp % 2 == 1) {
                System.out.println("Zlatan");
            } else {
                System.out.println("Ramos");
            }
        }
    }
}
