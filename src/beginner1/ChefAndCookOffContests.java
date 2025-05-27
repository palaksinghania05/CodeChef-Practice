package beginner1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ChefAndCookOffContests {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            String[] S = new String[N];
            for (int i = 0; i < N; i++) {
                S[i] = sc.next();
            }
            int count = 0;
            ArrayList<String> str = new ArrayList<>(Arrays.asList(S));
            if (str.contains("cakewalk")) count++;
            if (str.contains("simple")) count++;
            if (str.contains("easy")) count++;
            if (str.contains("easy-medium") || str.contains("medium"))
                count++;
            if (str.contains("medium-hard") || str.contains("hard"))
                count++;
            if (count == 5)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
