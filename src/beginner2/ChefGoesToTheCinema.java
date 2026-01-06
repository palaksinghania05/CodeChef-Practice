package beginner2;

import java.util.Scanner;

public class ChefGoesToTheCinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int X = sc.nextInt();
            int minTime = X;
            long pos = 1;
            int station = 1;
            while (pos < X || pos - X <= station) {
                int time = station + Math.abs((int) pos - X);
                minTime = Math.min(minTime, time);
                station++;
                pos += station;
            }
            System.out.println(minTime);
        }
    }
}
