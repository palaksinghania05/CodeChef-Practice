package beginner2;

import java.util.Scanner;

public class DigitalClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int H = sc.nextInt(), M = sc.nextInt();
            int result = 0;
            if (0 <= H && 0 <= M)
                result++;
            for (int i = 1; i <= 9; i++) {
                int temp2 = i * 10 + i;
                if (i < M && temp2 < H)
                    result++;
                if (i < M && i < H)
                    result++;
                if (temp2 < M && temp2 < H)
                    result++;
                if (temp2 < M && i < H)
                    result++;
            }
            System.out.println(result);
        }
    }
}
