package beginner2;

import java.util.Scanner;

public class SuperheroAndVillians {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int heros = 1;
            int villians = 1;
            String result = " ";
            boolean flag = false;
            for (int i = 0; i < N; i++) {
                String s = sc.next();
                if (s.endsWith("man")) heros++;
                else villians++;
                if (heros >= (villians + 2) && !flag) {
                    result = "superheroes";
                    flag = true;
                } else if (villians >= (heros + 3) && !flag) {
                    result = "villains";
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println("draw");
            } else {
                System.out.println(result);
            }
        }
    }
}
