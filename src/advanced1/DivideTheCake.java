package advanced1;

import java.util.Scanner;

public class DivideTheCake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            char temp1 = 'y';
            char temp2 = 'y';
            char temp3 = 'y';
            if (360 % N != 0) {
                temp1 = 'n';
            }
            if (N > 360) {
                temp2 = 'n';
            }
            if (N > 26) {
                temp3 = 'n';
            }
            System.out.println(temp1 + " " + temp2 + " " + temp3);
        }
    }
}
