package beginner2;

import java.util.Scanner;

public class ChefAndThreeDogs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            double s = sc.nextDouble();
            double v = sc.nextDouble();
            double time = ((double) 2 / 3) * (s / v);
            System.out.printf("%.6f%n", time);
        }
    }
}
