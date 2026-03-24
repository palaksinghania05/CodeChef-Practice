package beginner2;

import java.util.Scanner;

public class Xorry1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int temp = 1;
            while (temp <= N) {
                temp = temp << 1;
            }
            temp = temp >> 1;
            int a = temp;
            int b = temp ^ N;
            System.out.println(b + " " + a);
        }
    }
}
