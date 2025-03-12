package advanced1;

import java.util.Scanner;

public class ByteToBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt() - 1;
            long result = (long) Math.pow(2, N / 26);
            int temp = N % 26;
            if (temp < 2) {
                System.out.println(result + " 0 0 ");
            } else if (temp < 10) {
                System.out.println("0 " + result + " 0");
            } else {
                System.out.println("0 0 " + result);
            }
        }
    }
}
