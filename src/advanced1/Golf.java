package advanced1;

import java.util.Scanner;

public class Golf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int x = sc.nextInt();
            int k = sc.nextInt();
            if (x % k == 0 || (N + 1 - x) % k == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
