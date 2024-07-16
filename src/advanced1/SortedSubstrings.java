package advanced1;

import java.util.Scanner;

public class SortedSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            int count = 0;
            for (int i = 0; i < N - 1; i++) {
                if (S.charAt(i) == '1' && S.charAt(i + 1) == '0') {
                    count++;
                }
            }
            System.out.println(count);
            T--;
        }
    }
}
