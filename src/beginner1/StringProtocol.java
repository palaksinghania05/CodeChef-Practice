package beginner1;

import java.util.Scanner;

public class StringProtocol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            int i = 0;
            int operations = 0;
            while (i < S.length() - 1) {
                if (S.charAt(i) == S.charAt(i + 1)) {
                    operations++;
                    i += 2;
                } else {
                    operations++;
                    i += 1;
                }
            }
            if (i < N)
                operations++;
            System.out.println(operations);
            T--;
        }
    }
}
