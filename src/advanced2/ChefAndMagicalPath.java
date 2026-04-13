package advanced2;

import java.util.Scanner;

public class ChefAndMagicalPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextLong();
        while (T-- > 0) {
            long N = sc.nextLong();
            long M = sc.nextLong();
            if ((N % 2 == 1 && M % 2 == 1) || ((N == 1 && M > 2) || (M == 1 && N > 2))) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}
