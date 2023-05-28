package beginner1;

import java.util.Scanner;

public class CoinsAndTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int height = 0;
            while (((height * (height + 1)) / 2) < N) {
                height = height + 1;
            }
            if ((height * (height + 1)) / 2 == N)
                System.out.println(height);
            else
                System.out.println(height - 1);
            T--;
        }
    }
}
