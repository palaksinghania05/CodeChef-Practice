package advanced1;

import java.util.Scanner;

public class CarelessChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int even = 0, odd = 0;
            N *= 2;
            while (N-- > 0) {
                if (sc.nextInt() % 2 == 0)
                    ++even;
                else
                    ++odd;
            }
            if (even % 2 == 0 && odd % 2 == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
