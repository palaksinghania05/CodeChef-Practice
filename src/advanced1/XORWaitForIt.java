package advanced1;

import java.io.*;
import java.util.Scanner;

public class XORWaitForIt {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long l = sc.nextLong(), r = sc.nextLong();
            long odds = 0;
            if (l % 2 == 0 && r % 2 == 0) odds = (r - l) / 2;
            else odds = (r - l) / 2 + 1;
            if (odds % 2 == 0) out.write("Even\n");
            else out.write("Odd\n");
        }
        out.flush();
    }
}
