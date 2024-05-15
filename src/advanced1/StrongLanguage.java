package advanced1;

import java.util.Scanner;

public class StrongLanguage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T != 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            String S = sc.next();
            boolean flag = false;
            char[] ch = S.toCharArray();
            int temp = 0;
            for (int i = 0; i < N; i++) {
                if (ch[i] == '*') {
                    temp += 1;
                    if (temp == K) {
                        flag = true;
                    }
                } else {
                    temp = 0;
                }
            }
            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            T--;
        }
    }
}
