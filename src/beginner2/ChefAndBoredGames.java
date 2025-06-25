package beginner2;

import java.util.Scanner;

public class ChefAndBoredGames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int result = 0;
            for (int i = 1; i <= N; i++) {
                if ((i & 1) == 1) {
                    result += (N - i + 1) * (N - i + 1);
                }
            }
            System.out.println(result);
        }
    }
}
