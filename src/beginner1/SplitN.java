package beginner1;

import java.util.Scanner;

public class SplitN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(Integer.bitCount(N) - 1);
            T--;
        }
    }
}
