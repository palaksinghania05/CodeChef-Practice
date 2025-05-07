package beginner;

import java.util.Scanner;

public class CielAndReceipt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int p = sc.nextInt();
            int temp = 0;
            for (int i = 11; i >= 0; i--) {
                int ele = (int) Math.pow(2, i);
                while (ele <= p) {
                    temp++;
                    p = p - ele;
                }
            }
            System.out.println(temp);
        }
    }
}
