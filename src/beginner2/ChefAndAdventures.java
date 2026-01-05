package beginner2;

import java.util.Scanner;

public class ChefAndAdventures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if ((n - 1) % x == 0 && (m - 1) % y == 0 && (n - 1) >= 0 && (m - 1) >= 0)
                System.out.println("Chefirnemo");
            else if ((n - 2) % x == 0 && (m - 2) % y == 0 && (m - 2) >= 0 && (n - 2) >= 0)
                System.out.println("Chefirnemo");
            else
                System.out.println("Pofik");

        }
    }
}
