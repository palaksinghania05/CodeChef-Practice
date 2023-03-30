package beginner1;

import java.util.Scanner;

public class TwoDishes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int dishes = 0;
            while (B > 0) {
                if (A > 0) {
                    dishes++;
                    A--;
                } else if (C > 0) {
                    dishes++;
                    C--;
                }
                B--;
            }
            if (dishes >= N) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            T--;
        }
    }
}
