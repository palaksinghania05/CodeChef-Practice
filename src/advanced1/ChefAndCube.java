package advanced1;

import java.util.Scanner;

public class ChefAndCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            String front = sc.next();
            String back = sc.next();
            String left = sc.next();
            String right = sc.next();
            String top = sc.next();
            String bottom = sc.next();
            if ((front.equals(left) && left.equals(bottom)) || (front.equals(right) && right.equals(bottom)) || (back.equals(right) && right.equals(bottom)) ||
                    (back.equals(left) && left.equals(bottom)) || (front.equals(left) && left.equals(top)) || (front.equals(right) && right.equals(top)) ||
                    (right.equals(back) && back.equals(top)) || (back.equals(left) && left.equals(top)))
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
