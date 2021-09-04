package beginner;

import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t > 0) {
                int n = sc.nextInt();
                int m = 0;
                while (n > 0) {
                    int r = n % 10;
                    m = m * 10 + r;
                    n = n / 10;
                }
                System.out.println(m);
                t--;
            }
        }
    }
}
