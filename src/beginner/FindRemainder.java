package beginner;

import java.util.Scanner;

public class FindRemainder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(sc.hasNextInt()) {
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                long a = sc.nextLong();
                long b = sc.nextLong();
                System.out.println(a % b);
            }
        }
    }
}
