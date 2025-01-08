package advanced1;

import java.util.Scanner;

public class SchrodingerSmiley {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T > 0) {
            int N = sc.nextInt();
            sc.nextLine();
            String S = sc.nextLine();
            boolean flag = false, temp = false;
            int result = 0;
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == ':' && !temp) {
                    flag = true;
                    temp = true;
                } else if (S.charAt(i) == '(') {
                    flag = false;
                } else if (S.charAt(i) == ':' && flag && S.charAt(i - 1) != ':') {
                    result++;
                }
                if (S.charAt(i) == ':') {
                    flag = true;
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
