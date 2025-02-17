package advanced1;

import java.util.Scanner;

public class CatsAndDogs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long C = sc.nextInt();
            long D = sc.nextInt();
            long L = sc.nextInt();
            if (L % 4 != 0) {
                System.out.println("no");
                continue;
            }
            long temp1 = (C + D) * 4;
            long temp2 = D * 4 + Math.max(0, (C - 2 * D) * 4);

            if (L >= temp2 && L <= temp1)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}
