package advanced1;

import java.util.Scanner;

public class StrikeOrSpare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int temp = 1;
            StringBuilder str = new StringBuilder("1");
            for (int i = 0; i < N / 2; i++) {
                str.append("0");
            }
            System.out.println(temp + " " + str);
            T--;
        }
    }
}
