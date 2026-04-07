package advanced2;

import java.util.Scanner;

public class SuspenseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int temp = 0;
            String S = sc.next();
            StringBuilder result = new StringBuilder();
            if (N % 2 == 0) {
                temp = 1;
            }
            for (int i = 0; i < N / 2; i++) {
                if (S.charAt(i) == '0') {
                    result.insert(0, "0");
                } else {
                    result.append('1');
                }
                int k = N - 1 - i;
                if (S.charAt(k) == '0') {
                    result.append('0');
                } else {
                    result.insert(0, "1");
                }
            }
            if (temp == 0) {
                int i = (N - 1) / 2;
                if (S.charAt(i) == '0') {
                    result.insert(0, "0");
                } else {
                    result.append('1');
                }
            }
            System.out.println(result);
        }
        sc.close();
    }
}
