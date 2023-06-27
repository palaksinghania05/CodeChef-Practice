package beginner1;

import java.util.Scanner;

public class ThreeFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            if (X + Y - Z == 0)
                System.out.println("yes");
            else if (X - Y - Z == 0)
                System.out.println("yes");
            else if (-X - Y - Z == 0)
                System.out.println("yes");
            else if (-X + Y - Z == 0)
                System.out.println("yes");
            else if (-X - Y + Z == 0)
                System.out.println("yes");
            else if (X - Y + Z == 0)
                System.out.println("yes");
            else
                System.out.println("no");
            T--;
        }
    }
}
