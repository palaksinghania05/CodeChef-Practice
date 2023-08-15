package beginner1;

import java.util.Scanner;

public class ValidMinimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int minA = Math.min(a, b);
            int minB = Math.min(minA, c);
            int count = 0;
            if (a == minB)
                count++;
            if (b == minB)
                count++;
            if (c == minB)
                count++;
            if (count >= 2)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
