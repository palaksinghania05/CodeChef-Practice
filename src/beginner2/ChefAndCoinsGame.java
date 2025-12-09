package beginner2;

import java.util.Scanner;

public class ChefAndCoinsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            if (N % 6 == 0)
                System.out.println("Misha");
            else
                System.out.println("Chef");
        }
    }
}
