package advanced1;

import java.util.Scanner;

public class DevuAndGrapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            long K = sc.nextInt();
            long result = 0;
            long temp = (int) Math.pow(10, 9) + 7;
            while (N > 0) {
                long ele = sc.nextLong();
                long temp1 = ele / K;
                long temp2 = ele - K * temp1;
                long temp3 = K * (temp1 + 1) - ele;
                if (temp1 == 0)
                    result += temp3 % temp;
                else
                    result += (int) Math.min(temp2, temp3) % temp;
                N--;
            }
            System.out.println(result);
            T--;
        }
    }
}
