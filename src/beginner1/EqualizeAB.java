package beginner1;

import java.util.Scanner;

public class EqualizeAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int X = sc.nextInt();
            if (A == B || Math.abs(A - B) % (2 * X) == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            T--;
        }
    }
}
