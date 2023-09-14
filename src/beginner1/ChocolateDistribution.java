package beginner1;

import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int jar1, jar2, jar3;
            jar1 = 1;
            jar2 = 1;
            jar3 = N - 2;
            System.out.println(jar1 + " " + jar2 + " " + jar3);
            T--;
        }
    }
}
