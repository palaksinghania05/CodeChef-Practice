package advanced1;

import java.util.Scanner;

public class CampOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int days = sc.nextInt();
            int[] date = new int[days];
            int[] ques = new int[days];
            for (int i = 0; i < days; i++) {
                date[i] = sc.nextInt();
                ques[i] = sc.nextInt();
            }
            int scenarios = sc.nextInt();
            for (int j = 0; j < scenarios; j++) {
                int dead = sc.nextInt();
                int req = sc.nextInt();
                int sum = 0;
                for (int i = 0; i < days; i++) {
                    if (dead >= date[i]) sum += ques[i];
                }
                if (sum >= req)
                    System.out.println("Go Camp");
                else
                    System.out.println("Go Sleep");
            }
            T--;
        }
    }
}
