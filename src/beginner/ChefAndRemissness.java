package beginner;

import java.util.Scanner;

public class ChefAndRemissness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t > 0) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(Math.max(a, b) + " " + (a + b));
                t--;
            }
        }
    }
}
