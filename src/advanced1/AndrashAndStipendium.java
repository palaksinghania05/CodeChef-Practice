package advanced1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AndrashAndStipendium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            boolean flag = true;
            boolean fullScores = false;
            List<Integer> list = new ArrayList<>();
            long sum = 0;
            for (int i = 0; i < N; i++) {
                int temp = sc.nextInt();
                list.add(temp);
                sum += temp;
            }
            if (list.contains(2))
                flag = false;
            if (list.contains(5))
                fullScores = true;
            double avg = (double) sum / (float) N;
            System.out.println(flag && fullScores && avg >= 4.0 ? "Yes" : "No");
        }
    }
}
