package beginner2;

import java.util.Scanner;

public class ChefAndDice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextLong();
        while (T-- > 0) {
            long N = sc.nextLong();
            long result = 0;
            if (N % 4 == 0)
                result += (15 + 15 + 15 + 15);
            else if (N % 4 == 1) {
                result += 20;
                if (N / 4 > 0)
                    result += (11 + 15 + 15 + 15);
            } else if (N % 4 == 2) {
                result += (18 + 18);
                if (N / 4 > 0)
                    result += (11 + 11 + 15 + 15);
            } else {
                result = 15 + 18 + 18;
                if (N / 4 > 0)
                    result += (11 + 11 + 11 + 15);
            }
            if (N / 4 > 1)
                result += (11 * (N / 4 - 1) * 4);
            System.out.println(result);
        }
        sc.close();
    }
}
