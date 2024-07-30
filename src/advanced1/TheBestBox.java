package advanced1;

import java.util.Scanner;

public class TheBestBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            double P = sc.nextInt();
            double S = sc.nextInt();
            double temp1 = (P - Math.sqrt(P * P - 24 * S)) / 12;
            double temp2 = (P - 8 * temp1) / 4;
            double result = temp2 * temp1 * temp1;
            System.out.println(result);
            T--;
        }
    }
}
