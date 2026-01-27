package beginner2;

import java.util.Scanner;

public class LittleChefAndNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long x = 0, y = n;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (a == 1 || a == 0) {
                    y--;
                }
                if (a == 2)
                    x++;
            }
            System.out.println(((y - 1) * y / 2) - ((x - 1) * (x) / 2));
        }
    }
}
