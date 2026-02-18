package beginner2;

import java.util.Scanner;

public class WeirdPalindromeMaking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            long result = 0;
            for (int i = 0; i < N; i++) {
                if (sc.nextInt() % 2 == 1)
                    result++;
            }
            System.out.println(result / 2);
        }
    }
}
