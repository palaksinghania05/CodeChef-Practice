package advanced1;

import java.util.Scanner;

public class TheMorningCommute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            long result = 0l;
            for (int i = 0; i < N; i++) {
                int x, l, f;
                x = sc.nextInt();
                l = sc.nextInt();
                f = sc.nextInt();
                if (i == 0)
                    result += x;
                for (int j = x; ; j += f) {
                    if (j >= result) {
                        result = j;
                        break;
                    }
                }
                result += l;
            }
            System.out.println(result);
            T--;
        }
    }
}
