package advanced1;

import java.util.Scanner;

public class TomAndJerryGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            long TS = sc.nextLong();
            while (TS % 2 == 0)
                TS /= 2;
            if (TS == 1)
                System.out.println("0");
            else
                System.out.println(TS / 2);
            T--;
        }
    }
}
