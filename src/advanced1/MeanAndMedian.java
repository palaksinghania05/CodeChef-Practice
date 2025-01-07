package advanced1;

import java.util.Scanner;

public class MeanAndMedian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int temp = X * 3;
            int temp2 = temp - (2 * Y);
            System.out.println(Y + " " + Y + " " + temp2);
            T--;
        }
    }
}
