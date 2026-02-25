package beginner2;

import java.util.Scanner;

public class TheLargestBouquet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long Mg = sc.nextLong();
            long My = sc.nextLong();
            long Mr = sc.nextLong();
            long Og = sc.nextLong();
            long Oy = sc.nextLong();
            long Or = sc.nextLong();
            long Pg = sc.nextLong();
            long Py = sc.nextLong();
            long Pr = sc.nextLong();
            long result = 0;
            long temp1 = Pg + Py + Pr;
            long temp2 = Mg + My + Mr;
            long temp3 = Og + Oy + Or;
            result = (long) Math.max(Math.max(result, temp1), Math.max(temp2, temp3));
            long temp4 = Pg + Mg + Og;
            long temp5 = Py + My + Oy;
            long temp6 = Pr + Mr + Or;
            result = (long) Math.max(Math.max(result, temp4), Math.max(temp5, temp6));
            if ((result & 1) == 0 && result != 0) {
                System.out.println(result - 1);
            } else {
                System.out.println(result);
            }
        }
    }
}
