package beginner1;

import java.util.Scanner;

public class LostWeekends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int A1 = sc.nextInt();
            int A2 = sc.nextInt();
            int A3 = sc.nextInt();
            int A4 = sc.nextInt();
            int A5 = sc.nextInt();
            int P = sc.nextInt();
            int totalHours = A1 * P + A2 * P + A3 * P + A4 * P + A5 * P;
            if (totalHours > 120)
                System.out.println("Yes");
            else
                System.out.println("No");
            T--;
        }
    }
}
