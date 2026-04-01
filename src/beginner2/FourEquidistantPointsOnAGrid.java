package beginner2;

import java.util.Scanner;

public class FourEquidistantPointsOnAGrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int D = sc.nextInt();
            if (D % 2 != 0) {
                System.out.println(-1);
            } else {
                int half = D / 2;
                System.out.println("0 " + half);
                System.out.println(half + " 0");
                System.out.println(D + " " + half);
                System.out.println(half + " " + D);
            }
        }
        sc.close();
    }
}
