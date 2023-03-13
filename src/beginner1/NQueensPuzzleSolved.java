package beginner1;

import java.util.Scanner;

public class NQueensPuzzleSolved {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            double val = Math.pow((0.143 * N), N);
            System.out.println(Math.round(val));
            T--;
        }
    }
}
