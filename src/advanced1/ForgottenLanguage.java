package advanced1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class ForgottenLanguage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            sc.nextLine();
            ArrayList<String> list = new ArrayList<>();
            HashSet<String> tempSet = new HashSet<>();
            for (int i = 0; i < N; i++)
                list.add(sc.next());
            sc.nextLine();
            for (int i = 0; i < K; i++) {
                int ele = sc.nextInt();
                for (int j = 0; j < ele; j++)
                    tempSet.add(sc.next());
            }
            for (int i = 0; i < N; i++) {
                if (tempSet.contains(list.get(i)))
                    System.out.print("YES ");
                else
                    System.out.print("NO ");
            }
            System.out.println();
            T--;
        }
    }
}
