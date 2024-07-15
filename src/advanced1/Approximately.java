package advanced1;

import java.util.Scanner;

public class Approximately {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int numerator = 103993;
            int denominator = 33102;
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i <= N; i++) {
                if (i == 1)
                    stringBuilder.append(".");
                stringBuilder.append(numerator / denominator);
                numerator = (numerator % denominator) * 10;
            }
            System.out.println(stringBuilder);
            T--;
        }
    }
}
