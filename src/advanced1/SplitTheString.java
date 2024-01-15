package advanced1;

import java.util.Scanner;

public class SplitTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            String temp1 = S.substring(0, N - 1);
            String temp2 = S.substring(N - 1);
            int flag = 0;
            for (int i = 0; i < N - 1; i++) {
                if (temp1.charAt(i) == temp2.charAt(0)) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            T--;
        }
    }
}
