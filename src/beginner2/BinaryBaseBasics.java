package beginner2;

import java.util.Scanner;

public class BinaryBaseBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            String S = sc.next();
            int i = 0, j = N - 1, count = 0;
            while (i < j) {
                if (S.charAt(i) != S.charAt(j)) {
                    count++;
                }
                i++;
                j--;
            }
            if (N % 2 == 1) {
                if (count <= K) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                K -= count;
                if (K % 2 == 0 && K >= 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
