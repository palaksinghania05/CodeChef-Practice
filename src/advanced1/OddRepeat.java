package advanced1;

import java.util.Scanner;

public class OddRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int S = sc.nextInt();
            int temp = 0, count = 0, i = 1;
            while (count != N) {
                temp += i;
                count++;
                i += 2;
            }
            System.out.println((S - temp) / (K - 1));
            T--;
        }
    }
}
