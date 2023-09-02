package beginner1;

import java.util.Scanner;

public class Flatland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int count = 0;
            while (N != 0) {
                double m = Math.floor(Math.sqrt(N));
                N -= (m * m);
                count++;
            }
            System.out.println(count);
            T--;
        }
    }
}
