package advanced1;

import java.util.Scanner;

public class ChefAndRightTriangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int result = 0;
        while (T-- > 0) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int x3 = sc.nextInt();
            int y3 = sc.nextInt();
            int temp1 = (int) Math.pow((x2 - x1), 2) + (int) Math.pow((y2 - y1), 2);
            int temp2 = (int) Math.pow((x3 - x1), 2) + (int) Math.pow((y3 - y1), 2);
            int temp3 = (int) Math.pow((x3 - x2), 2) + (int) Math.pow((y3 - y2), 2);
            if (temp1 == (temp2 + temp3) || temp2 == (temp1 + temp3) || temp3 == (temp1 + temp2)) result++;
        }
        System.out.println(result);
    }
}
