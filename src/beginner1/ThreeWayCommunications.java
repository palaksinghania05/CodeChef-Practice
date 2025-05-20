package beginner1;

import java.util.Scanner;

public class ThreeWayCommunications {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int R = sc.nextInt();
            int X1 = sc.nextInt();
            int Y1 = sc.nextInt();
            int X2 = sc.nextInt();
            int Y2 = sc.nextInt();
            int X3 = sc.nextInt();
            int Y3 = sc.nextInt();
            double temp1 = Math.sqrt((X2 - X1) * (X2 - X1) + (Y2 - Y1) * (Y2 - Y1));
            double temp2 = Math.sqrt((X3 - X2) * (X3 - X2) + (Y3 - Y2) * (Y3 - Y2));
            double temp3 = Math.sqrt((X3 - X1) * (X3 - X1) + (Y3 - Y1) * (Y3 - Y1));
            if ((temp1 <= R && temp2 <= R) || (temp2 <= R && temp3 <= R) || (temp3 <= R && temp1 <= R)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
