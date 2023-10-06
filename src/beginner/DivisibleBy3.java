package beginner;

import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int count = 0;
            while (A != 0 || B != 0) {
                if (A % 3 == 0 || B % 3 == 0) {
                    System.out.println(count);
                    break;
                }
                A = A - B;
                count = count + 1;
            }
            T--;
        }
    }
}
