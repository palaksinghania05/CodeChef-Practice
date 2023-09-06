package shortContests.sept2023;

import java.util.Scanner;

public class SlowStart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int H = sc.nextInt();
            int damage = 0;
            int turns = 0;
            while (damage < H) {
                if (turns <= 5)
                    damage += X / 2;
                else
                    damage += X;
                turns++;
            }
            System.out.println(turns);
            T--;
        }
    }
}
