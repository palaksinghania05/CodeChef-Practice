package beginner2;

import java.util.Scanner;

public class TweedleDeeAndTweedleDum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            int[] A = new int[N];
            int temp = 0;
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                temp = temp ^ A[i];
            }
            if (temp % 2 == 0 && N == 1 && S.equals("Dee"))
                System.out.println("Dee");
            else
                System.out.println("Dum");
        }
    }
}
