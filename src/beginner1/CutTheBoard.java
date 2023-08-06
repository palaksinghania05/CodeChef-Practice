package beginner1;

import java.util.Scanner;

public class CutTheBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            System.out.println((N - 1) * (M - 1));
            T--;
        }
    }
}
