package beginner;

import java.util.Scanner;

public class SevenRings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            if ((N * X) >= 10000 && (N * X) <= 99999)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
