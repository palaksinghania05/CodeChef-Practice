package beginner1;

import java.util.Scanner;

public class ChefAndCardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int chef = 0, morty = 0;
            for (int i = 0; i < N; i++) {
                int A = sc.nextInt();
                int B = sc.nextInt();
                if (sum(A) > sum(B))
                    chef++;
                else if (sum(A) < sum(B))
                    morty++;
                else {
                    chef++;
                    morty++;
                }
            }
            if (chef > morty)
                System.out.println(0 + " " + chef);
            else if (morty > chef)
                System.out.println(1 + " " + morty);
            else
                System.out.println(2 + " " + chef);
            T--;
        }
    }

    public static int sum(int n) {
        int s = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            s = s + rem;
        }
        return s;
    }
}
