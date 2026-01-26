package beginner2;

import java.util.Scanner;

public class LittleChefAndNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            long X = 0, Y = N;
            for (int i = 0; i < N; i++) {
                int temp = sc.nextInt();
                if (temp == 1 || temp == 0) {
                    Y--;
                }
                if (temp == 2)
                    X++;
            }
            System.out.println(((Y - 1) * Y / 2) - ((X - 1) * (X) / 2));
        }
    }
}
