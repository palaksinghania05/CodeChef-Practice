/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 27-12-2022
 */

package beginner;

import java.util.Scanner;

public class ChefAndCookoff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int[] arr = new int[5];
            int solved = 0;
            for (int i = 0; i < 5; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 1)
                    solved++;
            }
            if (solved == 0)
                System.out.println("Beginner");
            else if (solved == 1)
                System.out.println("Junior Developer");
            else if (solved == 2)
                System.out.println("Middle Developer");
            else if (solved == 3)
                System.out.println("Senior Developer");
            else if (solved == 4)
                System.out.println("Hacker");
            else
                System.out.println("Jeff Dean");
            T--;
        }
    }
}
