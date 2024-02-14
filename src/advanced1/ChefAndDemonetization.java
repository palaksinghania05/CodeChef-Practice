package advanced1;

import java.util.Scanner;

public class ChefAndDemonetization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int S = sc.nextInt();
            int N = sc.nextInt();
            int count = 0;
            if (S % 2 != 0) {
                S--;
                count++;
            }
            while (S != 0) {
                count += S / N;
                if (S < N) {
                    count++;
                    break;
                }
                S = S % N;
            }
            System.out.println(count);
            T--;
        }
    }
}
