package advanced1;

import java.util.Scanner;

public class TheUnchangingOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            long N = sc.nextInt();
            long temp = 0;
            temp += (long) (Math.log(N) / Math.log(2));
            System.out.println(N - temp - 1);
            T--;
        }
    }
}
