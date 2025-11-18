package beginner2;

import java.util.Scanner;

public class GuessTheWinner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            T--;
            int N = sc.nextInt();
            if (N == 1) {
                System.out.println("Bob");
            } else {
                if (N % 2 == 0) {
                    System.out.println("Bob");
                } else {
                    System.out.println("Alice");
                }
            }
        }
    }
}
