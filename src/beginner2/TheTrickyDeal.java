package beginner2;

import java.util.Scanner;

public class TheTrickyDeal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long A = sc.nextLong();
            long chef = 0, friend = 0, temp1 = 0, temp2 = 0;
            long max = 0;
            int i = 0;
            while (true) {
                chef += A;
                friend += (long) Math.pow(2, i);
                if (chef < friend) {
                    temp1 = i;
                    break;
                }
                long temp = chef - friend;
                if (temp > max) {
                    max = temp;
                    temp2 = i + 1;
                }
                i++;
            }
            System.out.println(temp1 + " " + temp2);
        }
    }
}
