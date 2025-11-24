package beginner2;

import java.util.Scanner;

public class MrPrInADilemma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
            if (a == b) {
                System.out.println("YES");
            } else if (c == d) {
                System.out.println("NO");
            } else if (Math.abs(a - b) % Math.abs(c - d) == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
