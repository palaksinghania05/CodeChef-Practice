package advanced1;

import java.util.Scanner;

public class AdaKing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextLong();
        while (T > 0) {
            long K = sc.nextLong();
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (i == 0 && j == 0)
                        System.out.print("O");
                    else if (K > 0)
                        System.out.print(".");
                    else
                        System.out.print("X");
                    K--;
                }
                System.out.println();
            }
            T--;
        }
    }
}
