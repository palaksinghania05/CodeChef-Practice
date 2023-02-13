package beginner1;

import java.util.Scanner;

public class PeakFinding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int max = 0;
            while (N != 0) {
                int i = sc.nextInt();
                if (i > max)
                    max = i;
                N--;
            }
            System.out.println(max);
            T--;
        }
    }
}
