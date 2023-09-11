package beginner1;

import java.util.Scanner;

public class NonAdjacentFlips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String s = sc.next();
            int ones = 0;
            for (int j = 0; j < N; j++) {
                if (s.charAt(j) == '1') {
                    ones++;
                }
            }
            if (ones == 0) {
                System.out.println('0');
            } else {
                int count = 0;
                for (int j = 0; j < N - 1; j++) {
                    if (s.charAt(j) == s.charAt(j + 1) && s.charAt(j) == '1') {
                        count++;
                    }
                }
                if (count > 0) {
                    System.out.println('2');
                } else {
                    System.out.println('1');
                }
            }
            T--;
        }
    }
}
