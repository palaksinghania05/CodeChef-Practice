package beginner1;

import java.util.Scanner;

public class Plus2Minus1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            long N = sc.nextLong();
            System.out.println(0 + " " + N);
            T--;
        }
    }
}
