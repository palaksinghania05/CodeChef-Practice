package beginner1;

import java.util.Scanner;

public class LargeSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int A = sc.nextInt();
            int count = (int) Math.sqrt(N);
            System.out.println(A * count);
            T--;
        }
    }
}
