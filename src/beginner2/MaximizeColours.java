package beginner2;

import java.util.Scanner;

public class MaximizeColours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            int result = 0;
            if (X > 0) {
                result++;
                X--;
            }
            if (Y > 0) {
                result++;
                Y--;
            }
            if (Z > 0) {
                result++;
                Z--;
            }
            int sum = X + Y + Z;
            int temp1 = Math.max(X, Math.max(Y, Z));
            int temp2 = Math.min(X, Math.min(Y, Z));
            int temp3 = sum - temp1 - temp2;
            if (temp1 > 0 && temp3 > 0) {
                result++;
                temp1--;
                temp3--;
            }
            if (temp1 > 0 && temp2 > 0) {
                result++;
                temp1--;
                temp2--;
            }
            if (temp3 > 0 && temp2 > 0) {
                result++;
                temp3--;
                temp2--;
            }
            System.out.println(result);
        }
    }
}
