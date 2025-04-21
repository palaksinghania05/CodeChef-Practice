package beginner;

import java.util.Scanner;

public class FitSquaresInTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            if (N < 4) {
                System.out.println(0);
            } else {
                int temp = (N / 2) - 1;
                int count = 0;
                while (temp != 0) {
                    count += temp;
                    temp--;
                }
                System.out.println(count);
            }
        }
    }
}
