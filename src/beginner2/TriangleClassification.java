package beginner2;

import java.util.Arrays;
import java.util.Scanner;

public class TriangleClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int SUBTASK_ID = sc.nextInt();
        int T = sc.nextInt();
        while (T-- > 0) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int x3 = sc.nextInt();
            int y3 = sc.nextInt();
            int d1 = (int) Math.pow((x1 - x2), 2) + (int) Math.pow((y1 - y2), 2);
            int d2 = (int) Math.pow((x2 - x3), 2) + (int) Math.pow((y2 - y3), 2);
            int d3 = (int) Math.pow((x3 - x1), 2) + (int) Math.pow((y3 - y1), 2);
            String s1 = "";
            if (d1 != d2 && d2 != d3 && d1 != d3) {
                s1 = "Scalene";
            } else {
                s1 = "Isosceles";
            }
            if (SUBTASK_ID == 1) System.out.println(s1 + " " + "triangle");
            else {
                int[] a = {d1, d2, d3};
                Arrays.sort(a);
                if (a[2] == (a[1] + a[0]))
                    System.out.println(s1 + " " + "right triangle");
                else if (a[2] > (a[1] + a[0]))
                    System.out.println(s1 + " " + "obtuse triangle");
                else
                    System.out.println(s1 + " " + "acute triangle");
            }
        }
    }
}
