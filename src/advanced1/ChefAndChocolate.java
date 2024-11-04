package advanced1;

import java.util.Scanner;

public class ChefAndChocolate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            if (n % 2 != 0 && m % 2 != 0)
                System.out.println("No");
            else
                System.out.println("Yes");
            T--;
        }
    }
}
