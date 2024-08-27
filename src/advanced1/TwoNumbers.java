package advanced1;

import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int N = sc.nextInt();
            int temp1, temp2, result;
            if (N % 2 == 0) {
                temp1 = A;
            } else {
                temp1 = A * 2;
            }
            temp2 = B;
            if (temp1 < temp2) {
                result = temp2 / temp1;
            } else {
                result = temp1 / temp2;
            }
            System.out.println(result);
            T--;
        }
    }
}
