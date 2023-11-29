package advanced1;

import java.util.Scanner;

public class ClosestVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            long result = 1L;
            char[] ch = S.toCharArray();
            for (int i = 0; i < N; i++) {
                if (ch[i] == 'c' || ch[i] == 'g' || ch[i] == 'l' || ch[i] == 'r') {
                    result = (result * 2) % 1000000007;
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
