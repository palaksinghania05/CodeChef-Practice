package beginner2;

import java.util.Scanner;

public class SubtractOrDivide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int count = 0;
            if (N % 2 != 0)
                count = (N + 1) / 2;
            else {
                if (N % 4 == 0)
                    count = (N / 2) + (N / 4);
                else
                    count = (N / 2) + ((N + 2) / 4);
            }
            System.out.println(count);
        }
    }
}
