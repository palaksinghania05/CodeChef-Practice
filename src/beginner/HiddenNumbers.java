package beginner;

import java.util.Scanner;

public class HiddenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            if (N % 2 == 0) {
                System.out.println(2 + " " + N / 2);
            } else {
                System.out.println(1 + " " + N);
            }
            T--;
        }
    }
}
