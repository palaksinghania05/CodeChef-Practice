package advanced1;

import java.util.Scanner;

public class HelloEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            if (N < 5)
                System.out.println("NO");
            else {
                boolean flag = false;
                for (int i = 1; i < Math.sqrt(N); i++) {
                    if ((N - 2 * i) % (i + 2) == 0) {
                        flag = true;
                        break;
                    }
                }
                if (flag)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            T--;
        }
    }
}
