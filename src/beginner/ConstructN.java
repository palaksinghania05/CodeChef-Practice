package beginner;

import java.util.Scanner;

public class ConstructN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            if (N < 7 && N % 2 != 0)
                System.out.println("No");
            else
                System.out.println("Yes");
            T--;
        }
    }
}
