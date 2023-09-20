package beginner1;

import java.util.Scanner;

public class PermutationAndModulus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            for (int i = 0; i < N - 1; i++) {
                System.out.print((i + 2) + " ");
            }
            System.out.println(1);
            T--;
        }
    }
}
