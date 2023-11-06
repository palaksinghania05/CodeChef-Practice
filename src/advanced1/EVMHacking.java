package advanced1;

import java.util.Scanner;

public class EVMHacking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            float A = sc.nextFloat();
            float B = sc.nextFloat();
            float C = sc.nextFloat();
            float P = sc.nextFloat();
            float Q = sc.nextFloat();
            float R = sc.nextFloat();
            Float temp = (P + Q + R) / 2;
            if ((A + B + R) > temp || (A + Q + C) > temp || (P + B + C) > temp) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            T--;
        }
    }
}
