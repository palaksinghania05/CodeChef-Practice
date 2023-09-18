package beginner1;

import java.util.Scanner;

public class PrimeReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String A = sc.next();
            String B = sc.next();
            A = A.replace("1", "");
            B = B.replace("1", "");
            if (A.length() == B.length()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            T--;
        }
    }
}
